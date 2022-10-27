package com.example.retrofit_example.retrofit.datamodel.countryinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Translation(
    @SerializedName("common")
    @Expose
    val common: String,
    @SerializedName("official")
    @Expose
    val official: String
)
