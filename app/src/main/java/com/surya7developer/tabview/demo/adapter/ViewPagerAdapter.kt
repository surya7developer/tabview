package com.surya7developer.tabview.demo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.surya7developer.tabview.demo.fragment.HomeFragment
import com.surya7developer.tabview.demo.fragment.NotificationFragment
import com.surya7developer.tabview.demo.fragment.ProfileFragment
import com.surya7developer.tabview.demo.fragment.SearchFragment

/**
 * Created by admin on 27/11/23.
 */
class ViewPagerAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return SearchFragment()
            2 -> return NotificationFragment()
            3 -> return ProfileFragment()
        }
        return HomeFragment()
    }
}