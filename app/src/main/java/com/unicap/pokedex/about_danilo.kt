package com.unicap.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unicap.pokedex.databinding.ActivityAboutDaniloBinding

class about_danilo : AppCompatActivity() {

    private lateinit var binding: ActivityAboutDaniloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutDaniloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonD.setOnClickListener { back() }
    }

    private fun back() {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}