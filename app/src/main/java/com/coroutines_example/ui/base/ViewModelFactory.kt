package com.coroutines_example.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.coroutines_example.data.api.ApiHelper
import com.coroutines_example.data.repository.MainRepository
import com.coroutines_example.ui.main.viewModel.MainViewModel

class ViewModelFactory(private var apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}