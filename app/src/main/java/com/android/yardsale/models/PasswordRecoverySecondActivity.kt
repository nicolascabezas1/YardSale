package com.android.yardsale.models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.yardsale.R
import com.google.android.material.button.MaterialButton

class PasswordRecoverySecondActivity : AppCompatActivity() {
    private lateinit var buttonLogin: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery_second)
        initComponents()
        initListener()
    }
    private fun initComponents() {
        buttonLogin = findViewById(R.id.buttonLogin)
    }
    private fun initListener() {
        buttonLogin.setOnClickListener {
            val intent = Intent(this, NewPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}