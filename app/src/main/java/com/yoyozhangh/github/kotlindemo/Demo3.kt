package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {
    var  washMachine = WashMachine("小天鹅",12)
    washMachine.openDoor()

    washMachine.closeDoor()

    washMachine.selectMode(1)
    washMachine.start()

}