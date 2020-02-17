package com.example.test

import com.example.test.Model.ApiObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @Headers("accept: application/json")
    @GET("/api/v1/rest/datastore/F-C0032-001")
    fun getT(@Query("Authorization") auth: String?
                     ,@Query("locationName") location: String?
                     ,@Query("elementName") element: String?): Call<ApiObject>

}