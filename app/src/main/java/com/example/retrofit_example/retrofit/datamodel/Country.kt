package com.example.retrofit_example.retrofit.datamodel

import com.example.retrofit_example.retrofit.datamodel.countryinfo.Flags
import com.example.retrofit_example.retrofit.datamodel.countryinfo.Name
import com.example.retrofit_example.retrofit.datamodel.countryinfo.Translation
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("flags")
    @Expose
    val flags: Flags?,

    @SerializedName("name")
    @Expose
    var name: Name,

    @SerializedName("capital")
    @Expose
    val capital: List<String>?

) {
    @SerializedName("translations")
    @Expose
    var translations: Map<String, Translation>? = emptyMap()
}
