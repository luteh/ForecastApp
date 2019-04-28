package com.luteh.forecast.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import org.threeten.bp.Instant
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

const val WEATHER_LOCATION_ID = 0

@Entity(tableName = "weather_location")
data class WeatherLocation(
    @SerializedName("country")
    val country: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("localtime")
    val localtime: String,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Long,
    @SerializedName("lon")
    val lon: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("tz_id")
    val tzId: String
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = WEATHER_LOCATION_ID

    val zonedDateTime: ZonedDateTime
        get() {
            val instant = Instant.ofEpochSecond(localtimeEpoch)
            val zoneId = ZoneId.of(tzId)
            return ZonedDateTime.ofInstant(instant, zoneId)
        }
}
/*
{
    "name": "Bandung",
    "region": "West Java",
    "country": "Indonesia",
    "lat": -6.22,
    "lon": 106.31,
    "tz_id": "Asia/Jakarta",
    "localtime_epoch": 1555899801,
    "localtime": "2019-04-22 9:23"
}
*/
