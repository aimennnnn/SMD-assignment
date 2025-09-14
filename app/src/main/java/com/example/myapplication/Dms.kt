package com.example.myapplication

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.ui.dashboard.DashboardFragment
import android.view.View

class Dms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dms)

        findViewById<View>(R.id.msg1).setOnClickListener {
            startActivity(Intent(this@Dms, open_dm::class.java))
        }

        findViewById<View>(R.id.btnBack).setOnClickListener {
            startActivity(Intent(this@Dms, DashboardFragment::class.java))
        }
    }
}
