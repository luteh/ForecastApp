package com.luteh.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.luteh.forecast.data.db.entity.CURRENT_WEATHER_ID
import com.luteh.forecast.data.db.entity.CurrentWeatherEntry
import com.luteh.forecast.data.db.unitlocalized.ImperialCurrentWeatherEntry
import com.luteh.forecast.data.db.unitlocalized.MetricCurrentWeatherEntry

/**
 * Created by Luthfan Maftuh on 23/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(currentWeatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}
