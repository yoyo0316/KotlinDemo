package com.yoyozhangh.github.kotlindemo


class Rect(var height: Int, var width: Int)

fun main(args: Array<String>) {
    println("hello form idea kotlin")

    var rect0 = Rect(20, 10)
    println("矩形的高度:${rect0.height}")
    println("矩形的宽度:${rect0.width}")


    var girl = Girl("彪悍", "甜美")
    println("girl 这位妹子的声音 ：${girl.voice}")

    girl.cry()

    girl.smile()
}

// 妹子 长相，声音

class Girl(var chactor: String, var voice: String){
    fun smile(){
        println("妹子笑了一下，么么哒")
    }

    fun cry(){
        println("呜呜呜 ，人家在伤心呢 ")
    }
}

