package com.noahgreenmusic.permissionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.openGallery.setOnClickListener {
            opengGallery()
        }
    }

    private fun opengGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        startActivity(intent)
    }

}
