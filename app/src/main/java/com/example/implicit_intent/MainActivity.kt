package com.example.implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.implicit_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text1.setOnClickListener {
        val intent  = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.remove.bg/")
            startActivity(intent)

        }
    binding.text2.setOnClickListener {
        val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
        startActivity(intent)
    }
    }

}