package com.skydroid.collectiondemo.linkedlist


/**
 * Created by Akash Singh on 10-01-2022.
 */
data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}
