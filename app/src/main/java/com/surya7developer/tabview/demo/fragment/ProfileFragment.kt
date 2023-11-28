package com.surya7developer.tabview.demo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.surya7developer.tabview.demo.R
import com.surya7developer.tabview.demo.databinding.ActivityMainBinding
import com.surya7developer.tabview.demo.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        initView()


        return binding.root
    }

    private fun initView() {

        binding.idHeader.txtTitle.text = "Profile"
    }
}