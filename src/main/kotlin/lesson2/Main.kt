package lesson2

import java.util.*

fun main() {
//    try {
//        throw Exception("Error occurred")
//    }catch (e: Exception) {
//        println(e.message)
//    }finally {
//        println("Finally")
//    }

//    val scanner = Scanner(System.`in`)
//
//    val input = scanner.nextLine()
//
//    val num: Int?
//
//    try {
//        num = input.toInt()
//        val div = 20 / num
//        println(div)
//    }catch (e: Exception) {
//        println(e.message)
//    }

    val person = Person("James")

    person.name = null


    val s = person.name ?: throw IllegalArgumentException("Name required")

    println(s)
}

class Person(var name: String?)