package angelina.disney.model

import angelina.disney.R

data class Character(
    val name: String,
    val image: Int,
)

val listOfCharacter = listOf<Character>(
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image),
    Character("Rapuncel", R.drawable.character_image)
)
