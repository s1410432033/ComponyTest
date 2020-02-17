package com.example.test.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Field {
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null

}