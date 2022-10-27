package com.example.retrofit_example.retrofit.datamodel.countryinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Flags(
    @SerializedName("png")
    @Expose
    val png: String
)
