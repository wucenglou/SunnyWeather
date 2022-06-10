package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application(){
    companion object{
        /**
         * 接口 token
         */
        const val TOKEN = ""
        const val AppId = "85841439"
        const val AppSecret = "EKCDLT4I"

        /**
         * 全局context对象
         */
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}