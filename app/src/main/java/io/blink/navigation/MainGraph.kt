package io.blink.navigation

sealed class MainGraph(val route: String) {

    object MainScreen: MainGraph("main")

}
