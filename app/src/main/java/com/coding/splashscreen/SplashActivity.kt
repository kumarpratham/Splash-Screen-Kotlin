package com.coding.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val iHome = Intent(this,MainActivity::class.java)
        Handler().postDelayed({
            startActivity(iHome)
            finish()
        }, 5000)
    }
}