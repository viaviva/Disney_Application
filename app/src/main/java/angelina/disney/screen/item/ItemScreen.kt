package angelina.disney.screen.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import angelina.disney.R
import coil.compose.AsyncImage

@Composable
fun ItemScreen(
    id: Int,
    navController: NavHostController,
    viewModel: ItemViewModel = hiltViewModel()
) {

    val character = viewModel.character.observeAsState()
    viewModel.getCharacter(id.toString())

    Column {
        Row {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Image(
                    painter = painterResource(R.drawable.ic_my_button),
                    contentDescription = ""
                )
            }

            Button(onClick = {}) {
                Image(
                    painter = painterResource(R.drawable.ic_my_button),
                    contentDescription = ""
                )
            }
        }

        AsyncImage(
            model = character.value?.imageUrl,
            contentScale = ContentScale.FillBounds,
            contentDescription = "",
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .width(178.dp)
        )

        Text(text = character.value?.name.toString())
        Text(text = character.value?.id.toString())
    }

}