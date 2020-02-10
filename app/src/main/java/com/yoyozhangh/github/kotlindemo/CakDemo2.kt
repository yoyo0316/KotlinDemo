package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {

    while (true) {
        println("欢迎使用加法计算器")
        println("请输入第一个数字：")
        var num1Str = readLine()
        println("请输入第二个数字：")
        var num2Str = readLine()

        try {
            var num1 = num1Str!!.toInt()
            var num2 = num2Str!!.toInt()

            println("${num1} + ${num2} = ${num1 + num2}")

        } catch (e: Exception) {
            println(" 请输入数字，你输入的数字有问题吧")
        }
    }


}

