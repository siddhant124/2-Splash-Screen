package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.splashscreen.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object{
        private val SPLASH_SCREEN_TIME_OUT = 2000
//       After completion of 2000 ms, the next activity will get started.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root



        setContentView(view)


        Handler().postDelayed({ startActivity(Intent(this, HomeActivity::class.java))
            finish() }, 2000)

    }
}