package com.example.jetpack_compose_practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpack_compose_practice.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.text.text = "sample"
        setContentView(binding.root)
    }

}