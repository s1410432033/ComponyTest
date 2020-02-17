package com.example.test.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ApiObject {
    @SerializedName("success")
    @Expose
    var success: String? = null
    @SerializedName("result")
    @Expose
    var result: Result? = null
    @SerializedName("records")
    @Expose
    var records: Records? = null

}