package com.yoyozhangh.github.kotlindemo

/**
 * 程序员A 创建的洗衣机
 */
class WashMachine(var module: String, var size: Int) {

    var isDoorOpen = true;
    var currentMode = 0;
    fun openDoor() {
        println("洗衣机的门已经打开了。。。")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("洗衣机的门已经关闭了。。。")
        isDoorOpen = false
    }

    fun selectMode(mode: Int) {
        currentMode = mode
        when (mode) {
            0 -> println("初始模式，请您选择模式")
            1 -> println("轻柔")
            2 -> println("狂柔")
        }
    }

    fun start() {
        if (isDoorOpen) {
            println("bibibibi ... 门还没有关呢，不能运行")
        } else {

            when (currentMode) {
                0 -> {println("选择模式错误，不能开始洗衣服")}

                1->{
                    println("放水")
                    println("轻柔开始,发动机转速 慢")
                    println("洗完了")
                }
            }
        }
    }

    private fun setMoterSpeed(speed:Int){
        println("当前发动机转速为：${speed}圈/秒")
    }
}