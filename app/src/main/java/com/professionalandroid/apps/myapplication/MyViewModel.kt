package com.professionalandroid.apps.myapplication

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){
    val data = ArrayList<data>()

    fun mydata(){
        data.clear()
        for(i in 0 until 10){
            val sampledata = data("" +i , ""+1)
            data.add(sampledata)
        }

    }
}

