package com.yoyozhangh.github.kotlindemo


//变量的取值范围
fun main(arg: Array<String>) {
    val aByte:Byte = Byte.MAX_VALUE
    val bByte:Byte = Byte.MIN_VALUE
    println("Byte 的最大值："+aByte)
    println("Byte 的最小值："+bByte)


    val aLong:Long = Long.MAX_VALUE
    val bLong:Long = Long.MIN_VALUE

    println("Long 的最大值:"+aLong)
    println("Long 的最小值:"+bLong)
}