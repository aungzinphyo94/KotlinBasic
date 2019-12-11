fun main(args: Array<String>)
{
    val add = Add(5, 6)
    println("The Sum of numbers 5 and 6 is: ${add.c}")

    val minus = Minus(5, 6)

    Add(5,6)
}
//primary constructor
class Add constructor(a: Int,b:Int)
{
    var c = a+b;
}

class Minus constructor(a:Int, b: Int){
    var c = a - b

    init {
        println("$a minus $b is $c")
    }
}

//secondary constructor
class Multiply{
    constructor(a: Int, b: Int){
        var c = a + b
        println("Result: $c")
    }
}