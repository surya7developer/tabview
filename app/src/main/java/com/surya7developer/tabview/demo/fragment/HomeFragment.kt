package com.surya7developer.tabview.demo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.surya7developer.tabview.demo.R
import com.surya7developer.tabview.demo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater)
        initView()

        return binding.root
    }

    private fun initView() {

        binding.idHeader.txtTitle.text = "Home"
    }

}