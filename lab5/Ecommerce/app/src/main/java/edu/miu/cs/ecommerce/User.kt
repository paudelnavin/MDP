package edu.miu.cs.ecommerce

import java.io.Serializable

class User: Serializable {
    lateinit var firstname:String
    lateinit var lastname:String
    lateinit var email:String
    lateinit var password:String

    constructor(firstname: String, lastname: String, email: String, password: String) {
        this.firstname = firstname
        this.lastname = lastname
        this.email = email
        this.password = password
    }
}