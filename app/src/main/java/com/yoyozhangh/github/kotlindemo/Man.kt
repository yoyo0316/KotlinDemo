package com.yoyozhangh.github.kotlindemo

class Man(name: String) : Human(name) {
    override fun pee() {
        println("${name} 站着尿尿")
    }

    override fun eat() {
        println("${name} 哇哇哇 ，大口的吃")
    }
}