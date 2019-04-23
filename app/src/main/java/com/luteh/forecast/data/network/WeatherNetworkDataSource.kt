package com.luteh.forecast.data.network

import androidx.lifecycle.LiveData
import com.luteh.forecast.data.network.response.CurrentWeatherResponse

/**
 * Created by Luthfan Maftuh on 23/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}