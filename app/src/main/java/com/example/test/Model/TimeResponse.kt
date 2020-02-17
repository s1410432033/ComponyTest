package com.example.test.Model

import com.example.test.Model.Parameter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Time {
    @SerializedName("startTime")
    @Expose
    var startTime: String? = null
    @SerializedName("endTime")
    @Expose
    var endTime: String? = null
    @SerializedName("parameter")
    @Expose
    var parameter: Parameter? = null

}