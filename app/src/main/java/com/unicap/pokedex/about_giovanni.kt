package com.unicap.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unicap.pokedex.databinding.ActivityAboutGiovanniBinding

class about_giovanni : AppCompatActivity() {
    private lateinit var binding: ActivityAboutGiovanniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutGiovanniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonG.setOnClickListener { back() }
    }

    private fun back() {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}