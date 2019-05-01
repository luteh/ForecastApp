package com.luteh.forecast.data.provider

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

/**
 * Created by Luthfan Maftuh on 28/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
abstract class PreferenceProvider(context: Context) {
    private val appContext = context.applicationContext

    protected val preferences: SharedPreferences
        get() = PreferenceManager.getDefaultSharedPreferences(appContext)
}