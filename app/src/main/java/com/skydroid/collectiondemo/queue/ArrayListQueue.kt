package com.skydroid.collectiondemo.queue


/**
 * Created by Akash Singh on 10-01-2022.
 */
class ArrayListQueue<T> : Queue<T> {

    private val list = arrayListOf<T>()


    override val count: Int
        get() = list.size

    override fun peek(): T? = list.getOrNull(0)

    override fun enqueue(element: T): Boolean {
        list.add(element)
        return true
    }

    override fun dequeue(): T? =
        if (isEmpty) null else list.removeAt(0)


    override fun toString(): String = list.toString()


}