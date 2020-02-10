package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {

    var testClass: TestClass? = TestClass("zhanghe")

    testClass = null

//    if (testClass != null){
//        testClass.getName2()
//    }

//    var result = testClass!!.getName2()

    var list = listOf<String>("zhangh","mmmmm")

    for (item in list){
        println(item)
    }

//    println(result)
}

class TestClass(var name3: String) {
    var name: String? = "zhanghe"

    fun getName2(): String? {
        return name;
    }


}