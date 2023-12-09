package com.example.myapplicationcrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.xml.sax.HandlerBase

class SplashActivity : AppCompatActivity() {
    // Deklarasi variable timer splas screen muncul
    private val SPLASH_TIME_OUT:Long = 3000 // delay 3 second
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Kode menjalankan main activity setelah splash screen habis
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}