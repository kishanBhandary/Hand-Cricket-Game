package com.example.handcricketgame

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.handcricketgame.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    var userTotalNumber=0;
    var systemTotalNumber=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            // Game logic to be implemented here
        }
        binding.button3.setOnClickListener {

        }
        binding.button4.setOnClickListener {

        }
        binding.button5.setOnClickListener {

        }
        binding.button6.setOnClickListener {

        }
        binding.button7.setOnClickListener {

        }
        fun onGamePlay(number:Int){
            var systemNumber=(1..6).random()
            binding.textView2.text="System's number:$systemNumber"
            if(number==systemNumber){
                finish()
            }
        }
    }
}