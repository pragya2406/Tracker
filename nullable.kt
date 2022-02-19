package com.dfarm.prep101.kotlinprep

import java.util.*

private fun demo1() {
    var dt: Date? = null

    if(System.currentTimeMillis() > 5988) {
        dt=Date()
    }
    println("Time is ${dt!!.time}")

    println("Time is ${dt?.time}")
    if(dt != null) {
        println("Time is ${dt.time}")
    }
}

private fun demo2() {
    var dt: Array<String>? = null

    if(System.currentTimeMillis() > 5988) {
        dt = arrayOf("sdlkfjsldkf", "slkfkdsdklf", "dslfjslkdfj")
    }

    val ln = if(dt != null) dt.size else -3

    val ln1 = dt?.size ?: -1

    println("Length is ${ln}")
    println("Length is ${ln1}")
}
fun main() {
    demo1()
}