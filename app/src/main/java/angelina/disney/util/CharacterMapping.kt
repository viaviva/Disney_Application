package angelina.disney.util

import angelina.disney.model.Character
import angelina.disney.model.network.CharacterListResponse
import angelina.disney.model.network.CharacterResponse

fun CharacterListResponse.toCharacterList(): ArrayList<Character> {
    val list = arrayListOf<Character>()
    data.forEach { data ->
        list.add(
            Character(
                data._id,
                data.imageUrl,
                data.name,
                data.films,
                data.shortFilms,
                data.tvShows,
                data.videoGames
            )
        )
    }
    return list
}

fun CharacterResponse.toCharacter(): Character =
    Character(
        data._id,
        data.imageUrl,
        data.name,
        data.films,
        data.shortFilms,
        data.tvShows,
        data.videoGames
    )