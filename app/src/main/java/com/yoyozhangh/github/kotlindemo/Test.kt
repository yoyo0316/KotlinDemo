package com.yoyozhangh.github.kotlindemo

fun main(args: Array<String>) {
//    var  son1 = Son()
//    println("儿子的性格：${son1.chactor}")
//    son1.action()

//    var son = BigHeadSon()
//
//    son.washing()
//
//    var father = SmallHeadFathor()
//    father.washing()


    var  s:Son2 = Son2.xiaoxiaolv()
    s.say()

    var  s2:Son2 = Son2.xiaoluozi()

    var list = listOf<Son2>(s,s2)

    for (l in list){
        l.say()
    }
}