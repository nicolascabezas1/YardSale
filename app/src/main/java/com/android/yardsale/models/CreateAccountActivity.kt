package com.android.yardsale.models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.yardsale.R
import com.google.android.material.button.MaterialButton

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var buttonPrincipalCreateAccount: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        buttonPrincipalCreateAccount = findViewById(R.id.buttonPrincipalCreateAccount)
    }
    private fun initListeners() {
        buttonPrincipalCreateAccount.setOnClickListener {
            navigateActivity(HomeMainActivity::class.java)
        }
    }

    private fun navigateActivity(targetActivity: Class<*>) {
        val intent = Intent(this, targetActivity)
        startActivity(intent)
    }
}