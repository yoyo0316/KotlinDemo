package com.yoyozhangh.github.kotlindemo

import java.util.*

fun main(args: Array<String>) {
//    var lists = listOf("买鸡蛋","买大米","买冰淇淋")
//
//    for ((i,ee)in lists.withIndex()){
//        println("$i $ee")
//    }
//
//    var map = TreeMap<String,String>()
//    map["好" ] = "good"
//    map["学习" ] = "study"
//    map["天" ] = "day"
//    map["向上" ] = "up"

    var result = add(4, 5)
    println(result)

    var i = { x: Int, y: Int -> x + y }
    var result2 = i(3,7)
    println(result2)

    var j:(Int,Int)->Int = {x,y -> x+y}
    var result3 = j(6,3)
    println(result3)
}

fun add(x: Int, y: Int): Int = x + y

