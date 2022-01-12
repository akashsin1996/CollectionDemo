package com.skydroid.collectiondemo.search


/**
 * Created by Akash Singh on 12-01-2022.
 */
data class Edge<T>(
    val source: Vertex<T>,
    val destination: Vertex<T>,
    val weight: Double? = null
)