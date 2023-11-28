package com.surya7developer.tabview.demo.main

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by admin on 28/11/23.
 */
class MainViewModel(val mContext: Context) : ViewModel() {

    private var tabPosition : MutableLiveData<Int> = MutableLiveData()

    fun onClickTab(position:Int){
        tabPosition.value = position
    }


    fun getTabPosition(): MutableLiveData<Int> {
        return tabPosition
    }






    class MainViewModelFactory(val mContext: Context) : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(mContext) as T
        }
    }


}