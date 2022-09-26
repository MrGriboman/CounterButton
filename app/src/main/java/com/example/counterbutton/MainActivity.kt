package com.example.counterbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnPlusOne.setOnClickListener {
                val newValue = tvCount.text.toString().toInt() + 1
                tvCount.text = newValue.toString()
            }
        }
    }
}