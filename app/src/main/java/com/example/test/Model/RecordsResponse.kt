package com.example.test.Model

import com.example.test.Model.Location
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Records {
    @SerializedName("datasetDescription")
    @Expose
    var datasetDescription: String? = null
    @SerializedName("location")
    @Expose
    var location: List<Location>? = null

}