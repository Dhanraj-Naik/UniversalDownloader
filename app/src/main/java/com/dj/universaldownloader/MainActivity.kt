package com.dj.universaldownloader

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    var keepSplashOnScreen = true
    val delay = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //handle the splash screen transition
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition {
            keepSplashOnScreen
            //viewModel.isInitializationComplete()
        }
        Handler(Looper.getMainLooper()).postDelayed({ keepSplashOnScreen = false }, delay)
        setContentView(R.layout.activity_main)
    }

}