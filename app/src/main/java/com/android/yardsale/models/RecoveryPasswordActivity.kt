package com.android.yardsale.models

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.yardsale.R

class RecoveryPasswordActivity : AppCompatActivity() {
    private lateinit var textViewBackLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery_password)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        textViewBackLogin = findViewById(R.id.textViewBackLogin)
    }
    private fun initListeners() {
        textViewBackLogin.setOnClickListener {
            onBackPressed()
        }
    }
}