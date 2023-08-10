fun main(args: Array<String>){
    var marks= 100
    var grade = if(marks <= 40){
        println("E")
    }else if (marks <= 50){
        println("D")
    }else if (marks <= 60){
        println("C")
    }else if (marks <= 70){
        println("B")
    }else {
        println("A")
    }
    println(grade)

    var bettingNumber = 0
    var bettingResult = when(bettingNumber){
        1 ->{
            "You won a car"
        }
        2 ->{
            "You won a horse"
        }
        3 ->{
            "You won 3M"
        }
        4 ->{
            "You lost"
        }
        else ->{
            "Enter a number between 1 - 4 bet"
        }
    }
    println(bettingResult)
}