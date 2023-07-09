package angelina.disney.screen.item

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import angelina.disney.model.Character
import angelina.disney.repository.CharacterRepository
import angelina.disney.util.toCharacter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    val character = MutableLiveData<Character>()

    fun getCharacter(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = characterRepository.getCharacter(id)

            if (response.isSuccessful) {
                character.postValue(response.body()?.toCharacter())
            }
        }
    }
}