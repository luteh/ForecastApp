package com.luteh.forecast.data.provider

import com.luteh.forecast.data.db.entity.WeatherLocation

/**
 * Created by Luthfan Maftuh on 28/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}