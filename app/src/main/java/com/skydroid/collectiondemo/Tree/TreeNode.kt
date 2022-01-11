package com.skydroid.collectiondemo.Tree


/**
 * Created by Akash Singh on 10-01-2022.
 */
class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> =mutableListOf()
    fun add(child: TreeNode<T>) = children.add(child)
}