package com.anushka.viewmodeldemo2

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
     private var total = MutableLiveData<Int>()
     val totalData : LiveData<Int>
     get() = total

    @Bindable
    val inputText = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    fun setTotal(){
        inputText.value?.let {
            total.value =(total.value)?.plus(it.toInt())
        }
    }
}