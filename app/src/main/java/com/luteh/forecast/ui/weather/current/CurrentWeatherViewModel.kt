package com.luteh.forecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.luteh.forecast.data.repository.ForecastRepository
import com.luteh.forecast.internal.UnitSystem
import com.luteh.forecast.internal.lazyDeferred

class CurrentWeatherViewModel(private val forecastRepository: ForecastRepository) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC //get from settings later

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
