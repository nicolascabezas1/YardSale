package com.android.yardsale.models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.android.yardsale.R
import com.google.android.material.button.MaterialButton

class RecoveryPasswordActivity : AppCompatActivity() {
    private lateinit var textViewBackLogin: TextView
    private lateinit var textInputEditEmail: TextView
    private lateinit var buttonSubmit: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery_password)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        textViewBackLogin = findViewById(R.id.textViewBackLogin)
        textInputEditEmail = findViewById(R.id.textInputEditEmail)
        buttonSubmit = findViewById(R.id.buttonSubmit)
    }
    private fun initListeners() {
        textViewBackLogin.setOnClickListener {
            onBackPressed()
        }
        buttonSubmit.setOnClickListener {
            if (textInputEditEmail.text.isNotEmpty()) {
                navigateToPasswordSecond()
            } else {
                Toast.makeText(this, "Ingresa un email", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun navigateToPasswordSecond() {
        val intent = Intent(this, PasswordRecoverySecondActivity::class.java)
        startActivity(intent)
    }
}