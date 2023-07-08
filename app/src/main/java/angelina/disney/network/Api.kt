package angelina.disney.network

import angelina.disney.model.network.CharacterListResponse
import angelina.disney.model.network.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("character")
    suspend fun getAllCharacters(): Response<CharacterListResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: String): Response<CharacterResponse>
}