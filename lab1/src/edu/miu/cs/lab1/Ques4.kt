package edu.miu.cs.lab1

fun main(args: Array<String>){

    //Ques 4a
    var book = Book("Mobile Device Programming", "MIU", 12.35)
    book.read()

    //Ques 4b
    var ebook = Ebook("MDP", "MUM", 11.10)
    ebook.read()

    //Ques4c
    val bookDetail = Test("WAA","MIU", 12.87)
    bookDetail.read()
    var book1 = bookDetail.priceWithTax // Calling getter
    println("The price of book with tax is $book1")
    bookDetail.read()
    bookDetail.priceWithTax=22.34 // using setter
    bookDetail.read()
    println("Tax :  ${bookDetail.tax}") // calling getter
}