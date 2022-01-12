package com.skydroid.collectiondemo.sorting.radixSort

import com.skydroid.collectiondemo.Tree.TreeNode


/**
 * Created by Akash Singh on 12-01-2022.
 */
fun MutableList<Int>.radixSort() {
    // 1
    val base = 10
    // 2
    var done = false
    var digits = 1
    while (!done) {
        done = true
        // ...You’re sorting base 10 integers in this instance. Since you’ll use this value many
        //times in the algorithm, you store it in a constant base.
        // 1
        val buckets = arrayListOf<MutableList<Int>>().apply {
            for(i in 0..9) {
                this.add(arrayListOf())
            }
        }
        // 2
        this.forEach {
                number ->
            val remainingPart = number / digits
            val digit = remainingPart % base
            buckets[digit].add(number)
            if (remainingPart > 0) {
                done = false
            }
        }
        // 3
        digits *= base
        this.clear()
        this.addAll(buckets.flatten())
    }
}

