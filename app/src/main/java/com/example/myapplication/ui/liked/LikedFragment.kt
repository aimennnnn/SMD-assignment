package com.example.myapplication.ui.liked

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentLikedBinding
import com.example.myapplication.R
import com.example.myapplication.likedtwo   // <-- make sure likedtwo is an Activity

class LikedFragment : Fragment() {

    private var _binding: FragmentLikedBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: LikedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLikedBinding.inflate(inflater, container, false)
        val root = binding.root

        viewModel = ViewModelProvider(this)[LikedViewModel::class.java]

        root.findViewById<View>(R.id.tvFollowing).setOnClickListener {
            val intent = Intent(requireContext(), likedtwo::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
