package com.android.yardsale.models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.android.yardsale.R
import com.android.yardsale.models.objects.CreateAccountActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    private lateinit var editTextEmailUser: TextInputEditText
    private lateinit var textInputEditPassword: TextInputEditText
    private lateinit var buttonPrincipalLogin: MaterialButton
    private lateinit var textViewForgotPassword: TextView
    private lateinit var buttonSecondSignUp: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        editTextEmailUser = findViewById(R.id.textInputEditEmail)
        textInputEditPassword = findViewById(R.id.textInputEditPassword)
        buttonPrincipalLogin = findViewById(R.id.buttonPrincipalLogin)
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword)
        buttonSecondSignUp = findViewById(R.id.buttonSecondSignUp)
    }

    private fun initListeners() {
        textViewForgotPassword.setOnClickListener {
            navigateActivity(RecoveryPasswordActivity::class.java)
        }
        buttonSecondSignUp.setOnClickListener {
            navigateActivity(CreateAccountActivity::class.java)
        }
    }

    private fun navigateActivity(targetActivity: Class<*>) {
        val intent = Intent(this, targetActivity)
        startActivity(intent)
    }
}