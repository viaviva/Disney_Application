package angelina.disney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import angelina.disney.navigation.MainNavGraph
import angelina.disney.ui.theme.DisneyTheme
import angelina.disney.ui.theme.Purple40
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DisneyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Purple40
                ) {
                    MainNavGraph(rememberNavController())
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DisneyTheme {
        MainNavGraph(rememberNavController())
    }
}