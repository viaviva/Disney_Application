package angelina.disney.screen.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import angelina.disney.model.Character
import angelina.disney.repository.CharacterRepository
import angelina.disney.util.toCharacterList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    val listOfCharacter = MutableLiveData<ArrayList<Character>>()

    fun getAllCharacters() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = characterRepository.getAllCharacters()

            if (response.isSuccessful) {
                listOfCharacter.postValue(response.body()?.toCharacterList())
            }
        }
    }
}