package com.luteh.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.luteh.forecast.data.db.entity.WEATHER_LOCATION_ID
import com.luteh.forecast.data.db.entity.WeatherLocation

/**
 * Created by Luthfan Maftuh on 28/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
@Dao
interface WeatherLocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherLocation: WeatherLocation)

    @Query("select * from weather_location where id = $WEATHER_LOCATION_ID")
    fun getLocation(): LiveData<WeatherLocation>
}