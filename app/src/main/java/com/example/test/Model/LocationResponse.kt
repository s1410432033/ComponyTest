package com.example.test.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Location {
    @SerializedName("locationName")
    @Expose
    var locationName: String? = null
    @SerializedName("weatherElement")
    @Expose
    var weatherElement: List<WeatherElement>? = null

}