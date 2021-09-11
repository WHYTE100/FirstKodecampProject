package com.example.kodecampproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kodecampproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setOnClickListener {
            binding.textView.text = "I am passionate, driven and committed to finish Kodecamp as one of the best."
            binding.textView.isEnabled = false
            binding.textView3.visibility = View.VISIBLE
            binding.materialCardView2.visibility = View.VISIBLE
        }

        binding.textView3.setOnClickListener {
            binding.textView.text = "See More"
            binding.textView.isEnabled = true
            binding.materialCardView2.visibility = View.GONE
            binding.textView3.visibility = View.GONE
        }
    }
}