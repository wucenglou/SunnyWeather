package com.example.sunnyweather.logic.network

import com.example.sunnyweather.SunnyWeatherApplication
import com.example.sunnyweather.logic.model.DailyResponse
import com.example.sunnyweather.logic.model.PlaceResponse
import com.example.sunnyweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlaceService {

//    @GET("api?unescape=1&version=v1&appid=858414&appsecret=EKCDLT4I")


    /**
     * 彩云天气api
     */
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

    /**
     * 免费api
     */
    @GET("api?unescape=1&version=v1&appid=${SunnyWeatherApplication.AppId}&appsecret=${SunnyWeatherApplication.AppSecret}")
    fun searchCity(@Query("city") query: String): Call<PlaceResponse>

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces2(@Query("query") query: String): Call<PlaceResponse>
}