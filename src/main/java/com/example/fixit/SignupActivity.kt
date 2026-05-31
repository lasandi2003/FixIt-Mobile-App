package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    private lateinit var btnSignupSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupscreen) // your existing signup layout

        // Initialize the signup button
        btnSignupSubmit = findViewById(R.id.btnSignupSubmit)

        // Click listener to navigate to HomeActivity
        btnSignupSubmit.setOnClickListener {
            val intent = Intent(this@SignupActivity, HomeActivity::class.java)
            startActivity(intent)
            finish() // optional: close Signup screen so user can't go back
        }
    }
}

