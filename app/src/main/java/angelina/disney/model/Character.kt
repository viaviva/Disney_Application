package angelina.disney.model

data class Character(
    val id: Int,
    val imageUrl: String,
    val name: String,
    val films: List<String>,
    val shortFilms: List<String>,
    val tvShows: List<String>,
    val videoGames: List<String>
)