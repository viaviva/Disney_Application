package angelina.disney.repository

import angelina.disney.network.Api
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val api: Api
) {

    suspend fun getAllCharacters() = api.getAllCharacters()

    suspend fun getCharacter(id: String) = api.getCharacter(id)
}