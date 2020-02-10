package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {
   println(diaryGenerateer("天安门"))
}




fun diaryGenerateer(placeName: String): String {
    var tmple = """
        今天天气晴朗，万里无云，我们去${placeName}游玩，
        首先引入眼帘的是 ${placeName} ${placeName.length}个鎏金大字
        """

    return tmple
}


/**
 * fun  固定写法
 * plus 函数名称 (a 第一个参数，类型 Int) :Int 返回值是Int类型
 *
 */
fun plus(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mutl(a: Int, b: Int): Int {
    return a * b
}


fun sayHello(name: String): String {
    return name
}

fun checkAge(age: Int): Boolean {
    return age > 18
}

fun saveLog(logLevel: Int) {

}

