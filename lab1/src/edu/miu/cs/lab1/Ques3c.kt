package edu.miu.cs.lab1

import java.util.*

fun main(args: Array<String>){
    println("Enter your earth weight (in pound) to find in other planet: ")
    val reader = Scanner(System.`in`)
    var earthWeight:Int = reader.nextInt()

    println("Choice    Planet      Relative Gravity")
    println("1          Venus        0.78")
    println("2          Mars         0.39")
    println("3          Jupiter      2.65")
    println("4          Saturn       1.17")
    println("5          Uranus       1.05")
    println("6          Neptune      1.23")
    println("Please enter your choice to get weight in other planet: ")
    val read = Scanner(System.`in`)
    var choice:Int = read.nextInt()

    var weight: Int = 0
    when(choice){
        1-> { weight = (earthWeight * 0.78).toInt()
              println("Your weight in Venus is $weight pound")}
        2-> {weight = (earthWeight * 0.39).toInt()
            println("Your weight in Mars is $weight pound")}
        3-> {weight = (earthWeight * 2.65).toInt()
            println("Your weight in Jupiter is $weight pound")}
        4-> {weight = (earthWeight * 1.17).toInt()
            println("Your weight in Saturn is $weight pound")}
        5-> {weight = (earthWeight * 1.05).toInt()
            println("Your weight in Uranus is $weight pound")}
        6-> {weight = (earthWeight * 1.23).toInt()
            println("Your weight in Neptune is $weight pound")}
        else-> println("Please enter a correct choice.")
    }

}
