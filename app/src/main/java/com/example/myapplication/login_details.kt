package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class login_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_details)

         val btnLogin = findViewById<Button>(R.id.login)
        btnLogin.setOnClickListener {
            val intent = Intent(this@login_details, newsfeed::class.java)
            startActivity(intent)
        }

         val tvSignup = findViewById<TextView>(R.id.tvSignup)
        tvSignup.setOnClickListener {
            val intent = Intent(this@login_details, signup::class.java)
            startActivity(intent)
        }
    }
}
