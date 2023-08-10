package oop

open class Teacher(name:String,
                email:String,
                password:String):Student(name,email, password) {

       fun checkAttendance() {
           println("Yeah, i can check attendance")
       }
        fun submitResult(){
        println("Yeah, i can submit results")
        }
}