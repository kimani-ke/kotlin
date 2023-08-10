import kotlin.math.sqrt

fun main(args: Array<String>){
    //Inbuilt functions
    var greeting = "Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace(oldValue = "there", newValue = "king"))

    var number = 10.0
    println(sqrt(number))
    println(Math.pow(number,2.0))

//User defined functions
    motto()
    mision()
}

fun mottto (){
    println("Hello there this is our motto")
}
fun mission (){
    println("this is our mission")
}
fun add (){
    var x = 20
    var y = 10
    var z = x + y
    println("your answer is $z")
}
fun addition(x:Int, y:Int) {
    var z = x + y
    println("your name is $z")
}
fun avg (x:Double, y:Float, z:Int){
    var average  = (x + y + z) /3.0
    println("your answer is $average")
}
