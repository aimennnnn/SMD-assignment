package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class other_story : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_story)

        val img = findViewById<ImageView>(R.id.imgStory)
        img.setImageResource(R.drawable.razmon)

    }
}
