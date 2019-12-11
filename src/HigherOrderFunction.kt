// lambda expression
var lambda = {a: Int , b: Int -> a + b }
// higher order function
fun higherfunc( lmbd: (Int, Int) -> Int) {      // accepting lambda as parameter

    var result = lmbd(2,4)    // invokes the lambda expression by passing parameters
    println("The sum of two numbers is: $result")
}

fun add(a: Int, b: Int): Int{
    var sum = a + b
    return sum
}

fun higherfunc1(addfunc:(Int,Int)-> Int){
    // invoke regular function using local name
    var result = addfunc(3,6)
    print("The sum of two numbers is: $result")
}

fun multiply(a: Int, b: Int): Int{
    return a*b
}
//return function
fun higherfunc2() : ((Int,Int)-> Int){
    return ::multiply
}

fun main(args: Array<String>) {
    higherfunc(lambda)           //passing lambda as parameter

    val multiply = higherfunc2()
    val result = multiply(2,5)
    println("The multiplication of two numbers is: $result")

    higherfunc(::add)
}