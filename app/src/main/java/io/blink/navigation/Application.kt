package io.blink.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.blink.main.MainScreen

@Composable
fun Application() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MainGraph.MainScreen.route
    ) {
        composable(route = MainGraph.MainScreen.route) {
            MainScreen()
        }
    }

}
