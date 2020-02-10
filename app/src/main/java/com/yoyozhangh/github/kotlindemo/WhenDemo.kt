package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {
//    gradeStudent(3)

    var nums = 1..100 // 闭区间 [1 ,100]

    var  nums2  = 1 until 100 // [1,100)

    var nums3 = nums2.reversed()

    for (num in nums3 step 2){
        println(num)
    }
}



fun gradeStudent(score: String?) {
    when (score) {
        10.toString() -> println("考了满分，棒棒哒")
        9.toString() -> println("干的不错")
        8.toString() -> println("还可以")
        7.toString() -> println("还需努力")
        6.toString() -> println("刚好及格")
        else -> println("需要加油哦")
    }
}