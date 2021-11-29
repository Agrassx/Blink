package io.blink.main

import android.net.Uri
import androidx.lifecycle.ViewModel
import io.blink.domain.model.Link

class MainViewModel : ViewModel() {

    val linkList = listOf(
        Link("item1", "Google", Uri.parse("https://google.com/")),
        Link("item2", title = "ya.ru", Uri.parse("https://ya.ru")),
    )

}

