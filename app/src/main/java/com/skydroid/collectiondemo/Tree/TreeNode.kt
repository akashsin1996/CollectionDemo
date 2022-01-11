package com.skydroid.collectiondemo.Tree

import java.util.*


/**
 * Created by Akash Singh on 10-01-2022.
 */

typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) {


    private val children: MutableList<TreeNode<T>> =mutableListOf()
    fun add(child: TreeNode<T>) = children.add(child)


    //Depth-first traversal
    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)
        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }





}