package com.surya7developer.tabview.demo.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.surya7developer.tabview.demo.adapter.ViewPagerAdapter
import com.surya7developer.tabview.demo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var mainViewmodel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        initViewModel()
        setViewPager()

        mainViewmodel.getTabPosition().observe(this) {
            setCurrentPosition(it)
        }

    }

    private fun setViewPager() {
        binding.viewpager.adapter = ViewPagerAdapter(supportFragmentManager,0)
        setCurrentPosition(0)
    }

    private fun initView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initViewModel() {
        mainViewmodel = ViewModelProvider(this,
            MainViewModel.MainViewModelFactory(
                this))[MainViewModel::class.java]
        binding.mainViewmodel = mainViewmodel
    }

    private fun setCurrentPosition(position: Int) {
        binding.viewpager.setCurrentItem(position,true)
    }


}


