package angelina.disney.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import angelina.disney.screen.ItemScreen
import angelina.disney.screen.ListScreen
import angelina.disney.screen.MainScreen

const val MAIN_SCREEN = "mainScreen"
const val LIST_SCREEN = "listScreen"
const val ITEM_SCREEN = "productScreen"

@Composable
fun MainNavGraph(
    navController: NavHostController,
) {

    NavHost(
        navController = navController,
        startDestination = MAIN_SCREEN
    ) {
        composable(MAIN_SCREEN) {
            MainScreen(navController)
        }
        composable(LIST_SCREEN) {
            ListScreen(navController)
        }
        composable(ITEM_SCREEN) {
            ItemScreen(navController)
        }
    }
}