package com.coroutines_example.ui.main.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.coroutines_example.data.repository.MainRepository
import com.coroutines_example.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {
    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}