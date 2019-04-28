package com.luteh.forecast

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import com.luteh.forecast.data.db.ForecastDatabase
import com.luteh.forecast.data.db.WeatherLocationDao
import com.luteh.forecast.data.network.*
import com.luteh.forecast.data.provider.LocationProvider
import com.luteh.forecast.data.provider.LocationProviderImpl
import com.luteh.forecast.data.provider.UnitProvider
import com.luteh.forecast.data.provider.UnitProviderImpl
import com.luteh.forecast.data.repository.ForecastRepository
import com.luteh.forecast.data.repository.ForecastRepositoryImpl
import com.luteh.forecast.ui.weather.current.CurrentWeatherViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/**
 * Created by Luthfan Maftuh on 24/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
class ForecastApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@ForecastApplication))

        bind() from singleton { ForecastDatabase(instance()) }
        bind() from singleton { instance<ForecastDatabase>().currentWeatherDao() }
        bind() from singleton { instance<ForecastDatabase>().weatherLocationDao() }
        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { ApixuWeatherApiService(instance()) }
        bind<WeatherNetworkDataSource>() with singleton { WeatherNetworkDataSourceImpl(instance()) }
        bind<LocationProvider>() with singleton { LocationProviderImpl() }
        bind<ForecastRepository>() with singleton {
            ForecastRepositoryImpl(
                instance(),
                instance(),
                instance(),
                instance()
            )
        }
        bind<UnitProvider>() with singleton { UnitProviderImpl(instance()) }
        bind() from provider { CurrentWeatherViewModelFactory(instance(), instance()) }
    }


    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}