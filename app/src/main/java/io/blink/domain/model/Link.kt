package io.blink.domain.model

import android.net.Uri

data class Link(
    val id: String,
    val title: String,
    val url: Uri
)