package com.example.test

import com.google.gson.GsonBuilder
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

open class RetrofitSet(){

    val gson = GsonBuilder()
        .serializeNulls()
        .create()
    val retrofit = Retrofit.Builder()
        .baseUrl("https://opendata.cwb.gov.tw")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val apiInterface = retrofit.create(ApiService::class.java)
}