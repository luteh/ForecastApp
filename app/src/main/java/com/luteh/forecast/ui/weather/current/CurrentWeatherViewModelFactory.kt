package com.luteh.forecast.ui.weather.current

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.luteh.forecast.data.provider.UnitProvider
import com.luteh.forecast.data.repository.ForecastRepository

/**
 * Created by Luthfan Maftuh on 27/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
class CurrentWeatherViewModelFactory(
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CurrentWeatherViewModel(forecastRepository, unitProvider) as T
    }
}