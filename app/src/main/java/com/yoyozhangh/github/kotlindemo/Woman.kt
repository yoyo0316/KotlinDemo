package com.yoyozhangh.github.kotlindemo

class Woman(name:String) :Human(name){
    override fun pee() {
        println("${name} 蹲着尿尿")
    }

    override fun eat() {
        println("${name}呜呜呜，小口的吃 。。。")
    }
}