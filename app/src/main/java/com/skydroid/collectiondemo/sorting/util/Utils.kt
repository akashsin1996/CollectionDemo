package com.skydroid.collectiondemo.sorting.util


/**
 * Created by Akash Singh on 12-01-2022.
 */

    fun <T> ArrayList<T>.swapAt(first: Int, second: Int) {
        val aux = this[first]
        this[first] = this[second]
        this[second] = aux
    }
