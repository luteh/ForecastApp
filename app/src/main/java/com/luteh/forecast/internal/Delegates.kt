package com.luteh.forecast.internal

import kotlinx.coroutines.*

/**
 * Created by Luthfan Maftuh on 27/04/2019.
 * Email luthfanmaftuh@gmail.com
 */

/** Coroutine lazy */
fun <T> lazyDeferred(block: suspend CoroutineScope.() -> T): Lazy<Deferred<T>> {
    return lazy {
        GlobalScope.async(start = CoroutineStart.LAZY) {
            block.invoke(this)
        }
    }
}