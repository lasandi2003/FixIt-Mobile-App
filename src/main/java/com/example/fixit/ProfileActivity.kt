package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilescreen)

        // Initialize the Logout button
        btnLogout = findViewById(R.id.btnLogout)

        // Navigate to WelcomeActivity when Logout is clicked
        btnLogout.setOnClickListener {
            val intent = Intent(this@ProfileActivity, WelcomeActivity::class.java)
            startActivity(intent)
            finish() // closes ProfileActivity so user cannot go back
        }
    }
}
