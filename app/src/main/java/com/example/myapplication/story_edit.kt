package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class story_edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_story_edit)

        val close = findViewById<ImageView>(R.id.x)
        close.setOnClickListener {
            startActivity(Intent(this@story_edit, newsfeed::class.java))
            finish()
        }

        val btnNext = findViewById<ImageButton>(R.id.btnNext)
        btnNext.setOnClickListener {
            startActivity(Intent(this, newsfeed::class.java))
            finish()
        }

    }
}
