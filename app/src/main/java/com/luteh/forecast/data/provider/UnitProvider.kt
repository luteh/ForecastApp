package com.luteh.forecast.data.provider

import com.luteh.forecast.internal.UnitSystem

/**
 * Created by Luthfan Maftuh on 28/04/2019.
 * Email luthfanmaftuh@gmail.com
 */
interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}