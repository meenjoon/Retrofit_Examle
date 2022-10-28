package com.example.retrofit_example.retrofit.network.services

import com.example.retrofit_example.retrofit.datamodel.Country
import retrofit2.Call
import retrofit2.http.GET

interface CoutriesService {
    @GET("all")
    suspend fun getAll(): Call<Country>
}
