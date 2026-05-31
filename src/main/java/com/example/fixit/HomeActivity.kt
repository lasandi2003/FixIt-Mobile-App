package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var tipBtn: ImageButton
    private lateinit var bookingBtn: ImageButton
    private lateinit var profileBtn: ImageButton
    private lateinit var imgMan1: ImageView
    private lateinit var imgMan2: ImageView  // NEW

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen) // your Home layout

        // Initialize views
        tipBtn = findViewById(R.id.tiphomebtn)
        bookingBtn = findViewById(R.id.bookingbtn)
        val homeBtn = findViewById<ImageView>(R.id.homebtn)
        profileBtn = findViewById(R.id.profilebtn)
        imgMan1 = findViewById(R.id.imgman1)
        imgMan2 = findViewById(R.id.imgman2) // NEW

        // Navigate to TipsActivity
        tipBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, TipsActivity::class.java)
            startActivity(intent)
        }

        homeBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        // Navigate to BookingActivity
        bookingBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, BookinggActivity::class.java)
            startActivity(intent)
        }

        // Navigate to ProfileActivity
        profileBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Navigate to DetailScreen1
        imgMan1.setOnClickListener {
            val intent = Intent(this@HomeActivity, DetailScreen1Activity::class.java)
            startActivity(intent)
        }

        // Navigate to DetailScreen2 (NEW)
        imgMan2.setOnClickListener {
            val intent = Intent(this@HomeActivity, DetailScreen2Activity::class.java)
            startActivity(intent)
        }
    }
}





