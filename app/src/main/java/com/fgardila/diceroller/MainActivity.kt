package com.fgardila.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fgardila.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.rollButton.text = "Let's Roll"

    }
}