package com.skydroid.collectiondemo.sorting.insertionSort

import com.skydroid.collectiondemo.sorting.util.swapAt


/**
 * Created by Akash Singh on 12-01-2022.
 */
fun <T : Comparable<T>> ArrayList<T>.insertionSort(showPasses:
                                                   Boolean = false) {
    if (this.size < 2) return
    // 1
    for (current in 1 until this.size) {
        // 2
        for (shifting in (1..current).reversed()) {
            // 3
            if (this[shifting] < this[shifting - 1]) {
                this.swapAt(shifting, shifting - 1)
            } else {
                break
            }
        }
        // 4
        if(showPasses) println(this)
    }
}