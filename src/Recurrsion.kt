// Kotlin program of factorial using recursion
//traditional recursion
fun Fact(num: Int):Long{
    return if(num==1) num.toLong()        // terminate condition
    else num*Fact(num-1)
}

//tail recursion
fun Fact(num: Int, x:Int):Long{

    return if(num==1)   // terminate condition
        x.toLong()
    else
        Fact(num-1,x*num)   //tail recursion
}

//main method
fun main() {
    println("Factorial of 5 is: "+Fact(5))
//Recursive call

    var result = Fact(5,1)
    println("Factorial of 5 is: $result")
}