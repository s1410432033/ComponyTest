package com.example.test.Model

import com.example.test.Model.Time
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class WeatherElement {
    @SerializedName("elementName")
    @Expose
    var elementName: String? = null
    @SerializedName("time")
    @Expose
    var time: List<Time>? = null

}