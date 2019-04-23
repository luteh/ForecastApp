package com.luteh.forecast.data.db.entity

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("country")
    val country: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("localtime")
    val localtime: String,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int,
    @SerializedName("lon")
    val lon: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("tz_id")
    val tzId: String
)
/*
{
    "name": "Bandung",
    "region": "West Java",
    "country": "Indonesia",
    "lat": -6.22,
    "lon": 106.31,
    "tz_id": "Asia/Jakarta",
    "localtime_epoch": 1555899801,
    "localtime": "2019-04-22 9:23"
}
*/
