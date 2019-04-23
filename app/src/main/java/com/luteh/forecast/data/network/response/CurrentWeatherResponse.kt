package com.luteh.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.luteh.forecast.data.db.entity.CurrentWeatherEntry
import com.luteh.forecast.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    @SerializedName("location")
    val location: Location
)

/*
{
    "location":
    {
        "name": "Bandung",
        "region": "West Java",
        "country": "Indonesia",
        "lat":-6.22,
        "lon": 106.31,
        "tz_id": "Asia/Jakarta",
        "localtime_epoch": 1555899801,
        "localtime": "2019-04-22 9:23"
    },
    "current":
    {
        "last_updated_epoch": 1555899308,
        "last_updated": "2019-04-22 09:15",
        "temp_c": 31.0,
        "temp_f": 87.8,
        "is_day": 1,
        "condition": {
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
    }
}*/
