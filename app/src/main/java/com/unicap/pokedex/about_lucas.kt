package com.unicap.pokedex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.navigateUp
import com.unicap.pokedex.databinding.ActivityAboutLucasBinding

class about_lucas : AppCompatActivity() {

    private lateinit var binding: ActivityAboutLucasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutLucasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonL.setOnClickListener { back() }
    }

    private fun back() {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}