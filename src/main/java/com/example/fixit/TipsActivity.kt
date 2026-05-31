// File name: TipsActivity.kt
package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TipsActivity : AppCompatActivity() {

    private lateinit var tipbookingbtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tipsscreen) // Make sure this is your Tips screen layout

        // Initialize the ImageButton
        tipbookingbtn = findViewById(R.id.tipbookingbtn)

        // Navigate to BookingScreen when clicked
        tipbookingbtn.setOnClickListener {
            val intent = Intent(this@TipsActivity, BookinggActivity::class.java)
            startActivity(intent)
        }
    }
}

