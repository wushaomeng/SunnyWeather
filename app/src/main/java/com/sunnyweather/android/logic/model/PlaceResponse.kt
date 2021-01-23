package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @日期  2021/1/23 0023 16:57
 * @描述
 */

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)
