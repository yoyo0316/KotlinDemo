package com.yoyozhangh.github.kotlindemo

import java.math.BigInteger

// 演示递归
// 阶乘 1 的阶乘 1   2的阶乘 2*1   3 的阶乘 3*2*1 4的阶乘 4*3*2*1
// 5 的阶乘 5*4*3*2*1  n 的阶乘呢？
fun main() {
    var num = BigInteger("70")
    // 计算5的阶乘

    var result = fact(num)
    println("${num} 的阶乘是：" + result)
}

fun fact(num: BigInteger): BigInteger {
    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num * fact(num - BigInteger.ONE)
    }
}