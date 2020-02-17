package com.example.test.Model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Result {
    @SerializedName("resource_id")
    @Expose
    var resourceId: String? = null
    @SerializedName("fields")
    @Expose
    var fields: List<Field>? = null

}