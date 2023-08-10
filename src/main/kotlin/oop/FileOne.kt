package oop

import jdk.swing.interop.SwingInterOpUtils

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar = Car("Prado", "V8", "KDG123K")
    var secondCar = Car("Mercedes","c200" , "KCC123K")
    println(secondCar.name)

    var firstFruit = Fruit("Mango", "Yellow", 10.00)
    var secondFruit =Fruit("Apple", "Red", 30.00)
    println(firstFruit.price)

    var firstPhone = Phone("Iphone", "ios", "TypeC")
    var secondPhone = Phone("Samsung", "ios", "TypeC")
    firstPhone.call("0722156745")

    var firstStudent = Student("Marianne","marianne2@gmail.com", "pass254")

    firstStudent.register()
    firstStudent.login()
    firstStudent.logout()

    var firstTeacher = Teacher("Wanyama","wanyama@gmail.com", "254pass")

    firstTeacher.register()
    firstTeacher.login()
    firstTeacher.logout()
    firstTeacher.checkAttendance()
    firstTeacher.submitResult()


    var firstHod = Teacher("Maria","maria@gmail.com", "222pass")

    firstHod.register()
    firstHod.login()
    firstHod.logout()
    firstHod.checkAttendance()
    firstHod.submitResult()


    firstStudent.setIdNumber("94881719")
    println(firstStudent.getIdNumber())

    var maths = Maths()
    maths.grading()
    maths.standardizeResults()

    var history = History()
    history.grading()
    history.standardizeResults()

}