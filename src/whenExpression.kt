import java.util.Scanner;
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter any largebody:")
    var lb = reader.next()

    when(lb) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }

    //combine multiple branches
    var reader1 = Scanner(System.`in`)
    print("Enter name of planet: ")
    var name = reader.next()
    when(name) {
        "Mercury","Earth","Mars","Jupiter"
            ,"Neptune","Saturn","Venus","Uranus" -> println("Planet")
        else -> println("Neither planet nor star")
    }

    //value in range
    var reader2 = Scanner(System.`in`)
    print("Enter the month number of year: ")
    var num = reader.nextInt()
    when(num){
        in 1..3 -> println("It is spring season")
        in 4..6 -> println("It is summer season")
        in 7..8 ->println("It is rainy season")
        in 9..10 -> println("It is autumn season")
        in 11..12 -> println("It is winter season")
        !in 1..12 ->println("Enter valid month of year")
    }

    //certain type of variable
    var numOne: Any = "GeeksforGeeks"
    when(numOne){
        is Int -> println("It is an Integer")
        is String -> println("It is a String")
        is Double -> println("It is a Double")
    }

}