package angelina.disney.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import angelina.disney.screen.item.ItemScreen
import angelina.disney.screen.list.ListScreen
import angelina.disney.screen.MainScreen

const val MAIN_SCREEN = "mainScreen"
const val LIST_SCREEN = "listScreen"
const val ITEM_SCREEN = "itemScreen"

@Composable
fun MainNavGraph(
    navController: NavHostController
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
        composable(
            "$ITEM_SCREEN/{characterId}",
            arguments = listOf(navArgument("characterId") {
                type = NavType.IntType
            })
        ) {
            ItemScreen(it.arguments?.getInt("productId", 0) ?: 0, navController)
        }
    }
}