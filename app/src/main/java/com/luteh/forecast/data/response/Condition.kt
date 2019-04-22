package com.luteh.forecast.data.response

import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("code")
    val code: Int,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("text")
    val text: String
)

/*
{
    "text": "Partly cloudy",
    "icon": "//cdn.apixu.com/weather/64x64/day/116.png",
    "code": 1003
}*/
