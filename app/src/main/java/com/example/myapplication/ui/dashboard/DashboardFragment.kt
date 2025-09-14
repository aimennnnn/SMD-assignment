package com.example.myapplication.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.other_story
import com.example.myapplication.Dms
import com.example.myapplication.story_edit

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        root.findViewById<ImageView>(R.id.moosvi).setOnClickListener {
            startActivity(Intent(requireContext(), other_story::class.java))
        }

         root.findViewById<ImageView>(R.id.dms).setOnClickListener {
            startActivity(Intent(requireContext(), Dms::class.java))
        }

        root.findViewById<ImageView>(R.id.poststory).setOnClickListener {
            startActivity(Intent(requireContext(), story_edit::class.java))
        }

        return root
    }
}
