package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLoginSubmit: Button
    private lateinit var tvSignupLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginscreen) // your existing login layout

        // Initialize Login button
        btnLoginSubmit = findViewById(R.id.btnLoginSubmit)

        // Initialize Sign up TextView link
        tvSignupLink = findViewById(R.id.tvSignupLink)

        // Click listener to navigate to HomeActivity
        btnLoginSubmit.setOnClickListener {
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
            finish() // optional: close login screen
        }

        // Click listener to navigate to SignupActivity
        tvSignupLink.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}


