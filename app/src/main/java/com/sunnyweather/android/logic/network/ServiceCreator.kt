package com.sunnyweather.android.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @日期  2021/1/23 0023 17:03
 * @描述
 */
object ServiceCreator {

    private const val BASE_URL = "http://api.caiyunapp.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>) = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)

}