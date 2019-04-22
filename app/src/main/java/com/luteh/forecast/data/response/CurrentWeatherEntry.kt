package com.luteh.forecast.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntry(
    @SerializedName("cloud")
    val cloud: Int,
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("feelslike_c")
    val feelslikeC: Double,
    @SerializedName("feelslike_f")
    val feelslikeF: Double,
    @SerializedName("gust_kph")
    val gustKph: Double,
    @SerializedName("gust_mph")
    val gustMph: Double,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("is_day")
    val isDay: Int,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int,
    @SerializedName("precip_in")
    val precipIn: Double,
    @SerializedName("precip_mm")
    val precipMm: Double,
    @SerializedName("pressure_in")
    val pressureIn: Double,
    @SerializedName("pressure_mb")
    val pressureMb: Double,
    @SerializedName("temp_c")
    val tempC: Double,
    @SerializedName("temp_f")
    val tempF: Double,
    @SerializedName("uv")
    val uv: Double,
    @SerializedName("vis_km")
    val visKm: Double,
    @SerializedName("vis_miles")
    val visMiles: Double,
    @SerializedName("wind_degree")
    val windDegree: Int,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("wind_kph")
    val windKph: Double,
    @SerializedName("wind_mph")
    val windMph: Double
)

/*
{
    "last_updated_epoch": 1555899308,
    "last_updated": "2019-04-22 09:15",
    "temp_c": 31.0,
    "temp_f": 87.8,
    "is_day": 1,
    "condition":
    {
        "text": "Partly cloudy",
        "icon": "//cdn.apixu.com/weather/64x64/day/116.png",
        "code": 1003
    },
    "wind_mph": 13.6,
    "wind_kph": 22.0,
    "wind_degree": 110,
    "wind_dir": "ESE",
    "pressure_mb": 1008.0,
    "pressure_in": 30.2,
    "precip_mm": 0.0,
    "precip_in": 0.0,
    "humidity": 63,
    "cloud": 50,
    "feelslike_c": 35.7,
    "feelslike_f": 96.3,
    "vis_km": 9.0,
    "vis_miles": 5.0,
    "uv": 8.0,
    "gust_mph": 14.8,
    "gust_kph": 23.8
}*/
