package com.dfarm.prep101.kotlinprep

import java.util.*

private fun demo1() {
    val nums = intArrayOf(1, 98, 2, 78, 63, 52)

    println("0 -> ${nums.get(0)}")
    println("1 -> ${nums[1]}")
    println(nums.contentToString())

    val intNums = IntArray(5)
    println(intNums.contentToString())

    intNums[0] = 45
    intNums[1] = 12
    intNums[2] = 9
    intNums[3] = 96
    intNums[4] = 47
//    intNums[5] = 78

    println(intNums.contentToString())

    val intNums1 = IntArray(5) { 50 }
    val intNums2 = IntArray(5, { 50 })
    val intNums3 = IntArray(5, fun( n : Int ): Int {
        return 50
    })

    println(intNums3.contentToString())

    val arrBools = BooleanArray(5) { true }
    println(arrBools.contentToString())
}

private fun demo2() {
    val dates = Array<Date>(5) { Date() }
    println("0th -> ${dates[0]}")
    println("0th -> ${dates.get(0)}")
    println(dates.contentToString())

    val names = arrayOf<String>("android", "iOS", "Linux", "Windows")
    println(names.contentToString())
}


fun main() {
    demo1()
}