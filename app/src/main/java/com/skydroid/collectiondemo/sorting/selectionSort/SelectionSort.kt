package com.skydroid.collectiondemo.sorting.selectionSort

import com.skydroid.collectiondemo.sorting.util.swapAt


/**
 * Created by Akash Singh on 12-01-2022.
 */
fun <T : Comparable<T>> ArrayList<T>.selectionSort(showPasses:
                                                   Boolean = false) {
    if (this.size < 2) return
    // 1
    for (current in 0 until (this.size - 1)) {
        var lowest = current
        // 2
        for (other in (current + 1) until this.size) {
            if (this[lowest] > this[other]) {
                lowest = other
            }
            // 3
            if (lowest != current) {
                this.swapAt(lowest, current)
            }
            // 4
            if (showPasses) println(this)
        }
    }
}