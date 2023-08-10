package oop

open class Student (var name: String,
                open var email:String,
                open var password:String) {
    private var gender:String = ""
    fun setGender(gender:String){
        this.gender = gender
    }
    fun getGender():String{
        return this.gender
    }
    private var idNumber:String = ""
    fun setIdNumber(idNumber:String){
        this.idNumber = idNumber
    }
    fun getIdNumber():String{
        return this. idNumber
    }


    fun register() {
        println("Yeah , i can register")
    }
    fun login(){
        println("Yeah, i can login")
    }
    fun logout(){
        println("Yeah, i can logout")
    }
}
