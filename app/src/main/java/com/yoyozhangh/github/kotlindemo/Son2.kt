package com.yoyozhangh.github.kotlindemo

/**
 * 小母驴，小公驴，小公马 生下来的儿子
 * sealed  class  只能有有限个子类
 * 更在意的是数据的类型
 *
 */
sealed class Son2 {
    fun say() {
        println("大家好")
    }

    class xiaoxiaolv() : Son2()
    class xiaoluozi() : Son2()
}