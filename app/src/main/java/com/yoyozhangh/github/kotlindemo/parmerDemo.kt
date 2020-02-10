package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {

    var area = getRound(r = 2.0f)
    println(area)
}
val Pi = 3.14159f


fun getRectArea(a: Int, b: Int): Int {
    return a * b
}

fun getRound(pi: Float = Pi, r: Float): Float {
    return 2 * pi * r
}
