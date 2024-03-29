package com.dfarm.prep101

import java.util.*

private fun demo1(){
    val list = LinkedList<String>()
    list.add("abc")
    list.add("pqr")
    list.add("zyc")
    list.add("lmn")
    list.forEach(fun (el){
        println(el)
    })
    list.forEach({ el -> // lambda
        println(el)
    })

    list.forEach() { el ->
        println(el)
    }
    list.forEach {
        println(it)
    }
}

private fun demo2(){
    val list = listOfNotNull(1,89,56,6,78,96,10)
    list.forEach{
        if(it>40) {print("$it,")}

    }
    println()
    val filteredList = list.filter{it>40}
    println(filteredList.toString())

    val lst = list.findLast { it>40 }
    println(lst)

    println("First - ${list.first()}")
    println("Last - ${list.last()}")

    val max = list.maxOrNull() ?: -1
    println("Max on list is $max")
}

private fun demo3(){
    val list1 = listOfNotNull(1,89,56,42,6,78,96,10)
    val list2 = listOfNotNull(10,72,41,36,711,211,96,10)

    val commons = list1.filter { list2.contains(it) }
    println(commons)
}
private fun demo4() {
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)

    val squared = ArrayList<Int>()
    list.forEach { squared.add(it * it) }
    val sqd = list.map { it * it }
    list.map(fun(el): Int {
        return el * el
    })

    println(list)
    println(squared)
    println(sqd)
}

private fun demo5() {

    fun myFn(n : Int) : Unit {

    }
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)
    list.forEach(::println)
    list.forEach(::myFn)
    list.forEach({ el -> print(el) })
    list.forEach{ print(it) }
    list.forEach(fun(n : Int){
        print(n)
    })
}

private fun demo6() {
    val set = setOf<String?>("abc", null, "zxv", "pqr", "hij" ,"abc", "lmn")
    set.forEach(::println)

    println("---------------------")
    val set1 = setOf<String?>("abc","zxv", "pqr", "hij" ,"abc", "lmn") // remove null
    val arr = set1.toTypedArray()
    val sortedSet = TreeSet<String>(set1)
    sortedSet.forEach(::println)

    println("---------------------")
    println(arr.contentToString())
    Arrays.sort(arr)
    println(arr.contentToString())
}

private fun demo7() {
    val kvDs = HashMap<Int,String>()
    kvDs.put(1,"abc")
    kvDs[2] = "pwr"
    kvDs[3] = "lmn"
    kvDs[4] = "xyz"
    kvDs[5] = "def"
    kvDs[6] = "hij"
    kvDs[7] = "hij"

    kvDs.entries.forEach{
            entry -> println("Key - ${entry.key} Value- ${entry.value}")
    }
    kvDs.entries.forEach(::println)

    for ( (k,v) in kvDs ) {
        println("Key - $k Value - $v")
    }
}

fun main(){
    demo1()
    demo2()
    demo3()
    demo4()
    demo5()
    demo6()
    demo7()
}
