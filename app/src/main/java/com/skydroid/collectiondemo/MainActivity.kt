package com.skydroid.collectiondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.skydroid.collectiondemo.Tree.TreeNode
import com.skydroid.collectiondemo.binary_search_tree.BinarySearchTree
import com.skydroid.collectiondemo.binary_tree.BinaryNode
import com.skydroid.collectiondemo.databinding.ActivityMainBinding
import com.skydroid.collectiondemo.linkedlist.LinkedList
import com.skydroid.collectiondemo.linkedlist.Node
import com.skydroid.collectiondemo.queue.ArrayListQueue

/**
 * Created by Akash Singh on 10-01-2022.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Creating Node
        node()

        //Push Operation
       pushoperation()

        //using Fluent interface for Multiple Push Operation==
       fluesntInterface()

        //Append==
        append()

        //"inserting at a particular index" example {
        insertion()

        //linked list pop operation
        linkedListpop()

        //stack
        stack()

        //queue
        queue()

        //Tree
        tree()

        //binary_tree
        binaryTree()

        //binary search tree
        binarySearchTree()

    }

    private fun binarySearchTree() {
        val bst = BinarySearchTree<Int>()
        (0..4).forEach {
            bst.insert(it)
        }
        println("Binary Search Tree ==")
        println(bst)
    }

    private fun binaryTree() {
        val zero = BinaryNode(0)
        val one = BinaryNode(1)
        val five = BinaryNode(5)
        val seven = BinaryNode(7)
        val eight = BinaryNode(8)
        val nine = BinaryNode(9)
        seven.leftChild = one
        one.leftChild = zero
        one.rightChild = five
        seven.rightChild = nine
        nine.leftChild = eight
        val tree = seven
        println(tree)

        //inOrderTraversal
        println("inOrderTraversal==")
        tree.traverseInOrder { println(it) }

        println("Pre-order traversal==")
        //Pre-order traversal
        tree.traversePreOrder { println(it) }

        println("Post-order traversal==")
        //Post-order traversal
        tree.traversePostOrder { println(it) }

    }

    private fun tree() {
        val hot = TreeNode("Hot")
        val cold = TreeNode("Cold")
        val beverages = TreeNode("Beverages").run {
            add(hot)
            add(cold)
        }


        //Depth-first traversal
        val tree = makeBeverageTree()
        tree.forEachDepthFirst {
            println("Tree:--  "+it.value) }
    }

    fun makeBeverageTree(): TreeNode<String> {
        val tree = TreeNode("Beverages")
        val hot = TreeNode("hot")
        val cold = TreeNode("cold")
        val tea = TreeNode("tea")
        val coffee = TreeNode("coffee")
        val chocolate = TreeNode("cocoa")
        val blackTea = TreeNode("black")
        val greenTea = TreeNode("green")
        val chaiTea = TreeNode("chai")
        val soda = TreeNode("soda")
        val milk = TreeNode("milk")
        val gingerAle = TreeNode("ginger ale")
        val bitterLemon = TreeNode("bitter lemon")
        tree.add(hot)
        tree.add(cold)
        hot.add(tea)
        hot.add(coffee)
        hot.add(chocolate)
        cold.add(soda)
        cold.add(milk)
        tea.add(blackTea)
        tea.add(greenTea)
        tea.add(chaiTea)
        soda.add(gingerAle)
        soda.add(bitterLemon)
        return tree
    }

    private fun queue() {
        //  Queue with ArrayList
        val queue = ArrayListQueue<String>().apply {
            enqueue("Ray")
            enqueue("Brian")
            enqueue("Eric")
        }
        Log.e("queue-==",queue.toString())
        queue.dequeue()
        Log.e("after dequeue==",queue.toString())
        Log.e("Next Up queue-peek ==",queue.peek().toString())

    }

    private fun stack() {
        var stackDemo = mutableListOf<String>()

        var count = stackDemo.count()    //push
        stackDemo.add(count,"One")
        stackDemo.add(count,"two")
        stackDemo.add(count,"three")
        stackDemo.add(count,"four")
        stackDemo.add(count,"five")

        Log.e("Stack push --",stackDemo.toString())

        var count1 = stackDemo.count()
        stackDemo.removeAt(count1-4) // pop

        //position


        Log.e("Stack pop --",stackDemo.toString())
        Log.e("count1 --",count1.toString())
    }

    private fun linkedListpop() {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        Log.e("Before popping list:", list.toString())
        binding.tvBefPopList.text = list.toString()
        val poppedValue = list.pop()
        Log.e("After popping list:",list.toString())
        Log.e("Popped value:",poppedValue.toString())

        binding.tvAftPopList.text = list.toString()
        binding.tvPopValue.text = poppedValue.toString()

    }

    private fun insertion() {
        val particularIndexList = LinkedList<Int>()
        particularIndexList.push(3)
        particularIndexList.push(2)
        particularIndexList.push(1)

        Log.e("Before inserting: ",particularIndexList.toString())
        binding.tvBefInsert.text= particularIndexList.toString()
        var middleNode = particularIndexList.nodeAt(1)!!
        for (i in 1..3) {
            middleNode = particularIndexList.insert(-1 * i, middleNode)
        }
        Log.e("After inserting: ",particularIndexList.toString())
        binding.tvAftInsert.text= particularIndexList.toString()
    }

    private fun append() {
        val appendList = LinkedList<Int>()
        appendList.append(1)
        appendList.append(2)
        appendList.append(3)

        Log.e("Append--", appendList.toString())
        binding.tvAppend.text = appendList.toString()
        //Finish Append

    }

    private fun fluesntInterface() {
        val fluentPushList = LinkedList<Int>()
        fluentPushList.push(3).push(2).push(1)
        Log.e("FluentInterface-Push--", fluentPushList.toString())

        binding.tvFluentPush.text = fluentPushList.toString()
        //finish fluent interface

    }

    private fun pushoperation() {
        val singlePushList = LinkedList<Int>()
        singlePushList.singlePush(3)
        singlePushList.singlePush(2)
        singlePushList.singlePush(1)
        Log.e("Push--", singlePushList.toString())
        binding.tvSinglePush.text = singlePushList.toString()

        //Finish push

    }

    private fun node() {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        Log.e("Node--", node1.toString())
        binding.tvNode.text = node1.toString()

        //Finish node
    }

}