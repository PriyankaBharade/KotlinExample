package com.coroutines_example.data.api

import com.coroutines_example.utils.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}