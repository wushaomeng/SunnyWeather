package com.sunnyweather.android.logic.network

import com.sunnyweather.android.Myapplication
import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @日期  2021/1/23 0023 17:00
 * @描述
 */
interface PlaceService {

    @GET("v2/place?token=${Myapplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}