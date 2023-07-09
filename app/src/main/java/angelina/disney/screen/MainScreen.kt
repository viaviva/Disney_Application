package angelina.disney.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import angelina.disney.R
import angelina.disney.navigation.LIST_SCREEN
import angelina.disney.ui.theme.ButtonColor

@Composable
fun MainScreen(
    navController: NavHostController
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to Disney",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp, bottom = 0.dp),
        )

        Image(
            painter = painterResource(id = R.drawable.ic_birds),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .padding(vertical = 80.dp)
                .height(200.dp)
        )

        Button(
            onClick = { navController.navigate(LIST_SCREEN) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .height(64.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ButtonColor,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "GET STARTED"
            )
        }
    }

}