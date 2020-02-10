package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {
    var person1 = Man("金三胖")
    person1.eat()
    var person2 = Woman("蒙娜丽莎")
    var person3 = Woman("慈溪太后")

    var houseList = listOf<Human>(person1, person2, person3)

    for (h in houseList) {
        h.pee()
    }
}