package com.noahgreenmusic.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.noahgreenmusic.myapplication.databinding.ActivityRecyclerBindingBinding

class ActivityRecyclerBinding : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}