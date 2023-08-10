package oop

class Phone {
    var name:String
    var os :String
    var charger:String

    constructor(name: String, os: String, charger: String) {
        this.name = name
        this.os = os
        this.charger = charger
    }
    fun call(phoneNumber:String){
        println("I can sms the number $phoneNumber")
    }
    fun hungUp(){
        println("I can hung up a call")
    }
}