package com.shuklz.kotlin

import java.awt.Frame

class Basics {
    var i: Int = 0 //var = modifiable

    val a = "abc"                         // type inferred to String
    val b = 4                             // type inferred to Int

    val c: Double = 0.7                   // type declared explicitly
    val d: List<String> = ArrayList()     // type declared explicitly
    fun hello() {
        val str = "hello"
        print("$str World")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun maxOf(a: Float, b: Float): Float =
            if (a > b) a else b

    //default args
    fun build(title: String, width: Int = 800, height: Int = 600) {
        Frame()
    }

    fun main(args: Array<String>) {
        val obj: kotlin.Any = 0
        if (obj is String)
        /*print*/ obj.startsWith("hola") //TODO: Why doesnt work?

//        val john1 = Person("John")
//        val john2 = Person("John")
//        john1 == john2    // true  (structural equality)
//        john1 === john2   // false (referential equality)

        build("PacMan", 400, 300)                           // equivalent
        build(title = "PacMan", width = 400, height = 300)  // equivalent
        build(width = 400, height = 300, title = "PacMan")  // equivalent

        val x = 3
        when (x) {
            1 -> print("x is 1")
            2 -> print("so u r 2 now")
            3, 4 -> print("great, now you could be dead or alive")
            in 5..8 -> print("there we go")
            else -> print("hole hole ho jayega pyaar")
        }

        val res: Boolean = when {
            obj == null -> false
            obj is String -> true
            else -> throw IllegalStateException()
        }

    }

}

class Frame {
    var width: Int = 800
    var height: Int = 600

    val pixels: Int
        get() = width * height
}

data class Person(val name: String, val age: Int, val email: String)

val John = Person("Rishi", 26, "yoyo@yo.yo")

//operator overloading
data class Vec(val x: Float, var y: Float) {
    operator fun plus(v: Vec) {
        Vec(x + v.x, y + v.y)
    }
}

val z = Vec(1f, 2f) + Vec(3f, 4f)