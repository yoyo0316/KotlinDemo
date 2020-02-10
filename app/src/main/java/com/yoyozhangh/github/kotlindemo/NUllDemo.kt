package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {
var  result = heat("水")
    println(result)

   var  result2 = heat(null)
    println(result2)
}

//接收一个参数是非空的String类型，加上问号 代表的是参数可以为空
fun heat(str: String?): String {
    return "热" + str
}

