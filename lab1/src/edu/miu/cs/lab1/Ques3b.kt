package edu.miu.cs.lab1

fun main(args : Array<String>){
    var numbers: Array<Int> = arrayOf(1,2,3,4,6,5)
    var sum: Int = 0
    for (num in numbers){
        if(num%2 !=0){
            sum = sum + (num*num)
        }
    }
    println("The sum of odd squared values in the given array of integers is $sum")
}