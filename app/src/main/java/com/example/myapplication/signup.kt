package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

         val btnCreateAccount = findViewById<Button>(R.id.createanaccount)
        btnCreateAccount.setOnClickListener {
            startActivity(Intent(this@signup, newsfeed::class.java))
            finish()
        }

         val backArrow = findViewById<ImageView>(R.id.back_arrow)
        backArrow.setOnClickListener {
            startActivity(Intent(this@signup, login::class.java))
            finish()
        }
    }
}
