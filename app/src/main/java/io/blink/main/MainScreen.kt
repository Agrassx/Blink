package io.blink.main

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(mainViewModel: MainViewModel = viewModel()) {

    val context = LocalContext.current

    Column {

        Text(
            text = "Hello world",
            modifier = Modifier
                .testTag("text")
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .testTag("linkList"),
        ) {
            items(mainViewModel.linkList) {
                Text(
                    text = it.title,
                    modifier = Modifier
                        .clickable {
                            startActivity(context, Intent(Intent.ACTION_VIEW, it.url), null)
                        }
                        .testTag("linkList-${it.id}")
                )
            }
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}


