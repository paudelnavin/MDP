package edu.miu.cs.lab1

open class Book {

        var title:String? = "Please enter a title"
        var author:String? = "Please enter an author"
        var price:Double = 0.0

        constructor(title:String) {
            this.title = title
        }

        constructor(title:String, author: String, price:Double) {
            this.title = title
            this.author = author
            this.price = price
        }

        open fun read() {
            println("Reading paper book")
        }

//        override fun toString(): String{
//            return "Title: $title, Author: $author, Price: $price"
//        }

}

class Ebook: Book {

    constructor(title: String): super(title){
    }

    constructor(title: String, author: String, price: Double): super(title, author, price){
    }

    override fun read(){
        println("Read from Electronic Device.")
    }
}