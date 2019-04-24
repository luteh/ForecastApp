package com.luteh.forecast.data.repository

import androidx.lifecycle.LiveData
import com.luteh.forecast.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

/**
 * Created by Luthfan Maftuh on 24/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}