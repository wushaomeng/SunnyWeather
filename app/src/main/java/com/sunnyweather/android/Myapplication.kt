package com.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * @日期  2021/1/23 0023 16:49
 * @描述
 */
class Myapplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN= "IweAdlxbQSEGim7l"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}