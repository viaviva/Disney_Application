package angelina.disney.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import angelina.disney.navigation.LIST_SCREEN

@Composable
fun MainScreen(
    navController: NavHostController
) {

    Column(
        Modifier.padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to Disney",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 190.dp, bottom = 0.dp)
        )

        Button(
            onClick = { navController.navigate(LIST_SCREEN) },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Get started"
            )
        }
    }

}