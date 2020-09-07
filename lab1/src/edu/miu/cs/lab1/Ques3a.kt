package edu.miu.cs.lab1

import java.util.*

fun main(args: Array<String>){

    val reader = Scanner(System.`in`)
    print("Enter a number to find its first and last digit: ")

    var number:Int = reader.nextInt()

//    println("Your entered number is $number")

    println("First digit of a given number is ${firstDigit(number)} and last digit of a given number is " +
            "${lastDigit(number)}")
}

fun firstDigit(n:Int):Int{
    var num = n
    while (num >= 10){
        num = num/10
    }
    return num
}

//fun lastDigit(n:Int):Int = n%10
fun lastDigit(n:Int) = n%10