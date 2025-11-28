package com.example.handcricketgame

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.handcricketgame.databinding.ActivityWelcomeactiviityBinding

class Welcomeactiviity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeactiviityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWelcomeactiviityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            startActivity(Intent(this,GameActivity::class.java))
        }
    }
}