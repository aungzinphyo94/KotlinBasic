fun main(args: Array<String>) {
    var number = 6
    var factorial = 1

    do {
        factorial *= number
        number--
    }while(number > 0)
    println("Factorial of 6 is $factorial")
}