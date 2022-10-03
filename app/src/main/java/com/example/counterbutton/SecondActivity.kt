package com.example.counterbutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterbutton.databinding.ActivitySecondBinding
import java.util.*

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val counterValue = intent.getIntExtra("counterValue", 0)
        binding.tvNumber.text = (0..counterValue).random().toString()

        binding.tvNumber.setTextColor(randomColor())
    }

    private fun randomColor(): Int {
        val rnd = Random()
        return Color.argb(
            255,
            rnd.nextInt(256),
            rnd.nextInt(256),
            rnd.nextInt(256)
        )
    }
}