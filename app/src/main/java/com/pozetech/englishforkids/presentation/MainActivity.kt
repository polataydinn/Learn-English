package com.pozetech.englishforkids.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pozetech.englishforkids.R
import com.pozetech.englishforkids.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}