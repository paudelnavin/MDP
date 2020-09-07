package edu.miu.cs.lab1

class Test (var title: String, var author: String, var price: Double) {
       val tax:Double = 1.2
       var priceWithTax:Double

       get(){
            return price + tax
       }

       set(value){
            price = value + price + tax
       }

        fun read(){
            println("Title: $title, Author: $author, Price: $price")
        }

}