package io.blink.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(
    navController: NavController
) {
    Text(
        text = "Hello world",
        modifier = Modifier
            .testTag("text")
    )
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen(rememberNavController())
}


