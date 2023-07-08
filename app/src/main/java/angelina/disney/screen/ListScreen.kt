package angelina.disney.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import angelina.disney.R
import angelina.disney.model.listOfCharacter
import angelina.disney.navigation.ITEM_SCREEN
import angelina.disney.ui.theme.ButtonColor

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListScreen(
    navController: NavHostController
) {

    Column(
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        Row {
            ListButton(icon = R.drawable.all_button, buttonText = "All")
            ListButton(icon = R.drawable.my_button, buttonText = "My")
        }

        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(listOfCharacter) {
                Column(
                    modifier = Modifier.selectable(
                        true,
                        onClick = { navController.navigate(ITEM_SCREEN) })
                ) {
                    Column {
                        Image(
                            painter = painterResource(id = it.image),
                            contentDescription = "",
                            modifier = Modifier.clip(RoundedCornerShape(16.dp))
                        )

                        Text(
                            text = it.name,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ListButton(
    icon: Int,
    buttonText: String
) {

    Column(
        modifier = Modifier.padding(top = 66.dp, bottom = 24.dp, end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FloatingActionButton(
            onClick = {},
            modifier = Modifier
                .size(65.dp)
                .clip(RoundedCornerShape(25.dp)),
            containerColor = ButtonColor,
            contentColor = Color.White,
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = ""
            )
        }

        Text(
            text = buttonText,
            modifier = Modifier.padding(top = 8.dp)
        )
    }

}