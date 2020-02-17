package com.example.test.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Parameter {
    @SerializedName("parameterName")
    @Expose
    var parameterName: String? = null
    @SerializedName("parameterUnit")
    @Expose
    var parameterUnit: String? = null

}