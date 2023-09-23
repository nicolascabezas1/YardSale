package com.android.yardsale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.android.yardsale.models.LoginActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var imageViewYardSaleLogo: ImageView
    private lateinit var buttonGetInto: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        setListeners()
    }

    private fun initComponents() {
        imageViewYardSaleLogo = findViewById(R.id.imageViewYardSaleLogo)
        buttonGetInto = findViewById(R.id.buttonGetInto)
    }

    private fun setListeners() {
        buttonGetInto.setOnClickListener {
            navigateToLogin()
        }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}