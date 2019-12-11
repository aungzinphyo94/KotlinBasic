import java.util.Scanner
fun main(args: Array<String>){
    val a = 1000
    val b = 999
    var c = 1122

    //if expression
    if(a > 0){
        println("Yes,number is positive")
    }

    //if-else expression
    if(a > b){
        println("Number $a is larger than $b")
    }
    else{
        println("Number $b is larger than $a")
    }

    var max1 = if(a > b) a else b
    var max2 = if(c > a) c else a
    println("The maximum of ${a} and ${b} is $max1 " )
    println("The maximum of ${c} and ${a} is $max2 " )

    //if-else with Ternary
    var max = if(a > b){
        println("Greater number is: ")
        a
    }
    else{
        println("Greater number is:")
        b
    }
    println(max)

    //if-else-if expression
    val reader = Scanner(System.`in`)
    println("Enter any number: ")

    // read the next Integer value
    var num = reader.nextInt()
    var result  = if ( num > 0){
        "$num is positive number"
    }
    else if( num < 0){
        "$num is negative number"
    }
    else{
        "$num is equal to zero"
    }
    println(result)

    //nested if expression
    // create an object for scanner class
    val reader1 = Scanner(System.`in`)
    print("Enter three numbers: ")

    var num1 = reader.nextInt()
    var num2 = reader.nextInt()
    var num3 = reader.nextInt()

    var maxNum  = if ( num1 > num2) {
        if (num1 > num3) {
            "$num1 is the largest number"
        }
        else {
            "$num3 is the largest number"
        }
    }
    else if( num2 > num3){
        "$num2 is the largest number"
    }
    else{
        "$num3 is the largest number"
    }
    println(maxNum)
}