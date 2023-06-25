package angelina.disney.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import angelina.disney.R

@Composable
fun ItemScreen(
    navController: NavHostController
) {

    Column {
        Row {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Image(
                    painter = painterResource(R.drawable.my_button),
                    contentDescription = ""
                )
            }

            Button(onClick = {}) {
                Image(
                    painter = painterResource(R.drawable.my_button),
                    contentDescription = ""
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.character_image),
            contentDescription = "",
            modifier = Modifier.clip(RoundedCornerShape(16.dp))
        )

        Text(text = "Rapunzel")
        Text(text = "Princess")
    }

}