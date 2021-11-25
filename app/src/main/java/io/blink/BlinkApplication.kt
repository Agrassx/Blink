package io.blink

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BlinkApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}
