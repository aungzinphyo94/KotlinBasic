fun main(args: Array<String>)
{
    for (i in 1..6) {
        print("$i ")
    }
    println()

    //step
    for (i in 1..10 step 3) {
        print("$i ")
    }
    println()

    //downTo
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    //downTo and step
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
    println()

    //array
    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)

    //without index
    for (num in numbers){
        if(num%2 == 0){
            print("$num ")
        }
    }
    println()

    //with index
    for (i in numbers.indices) {
        println(numbers[i])
    }

    //library function
    for ((index,value) in numbers.withIndex()) {
        println("Element at $index th index is $value")
    }

    //string
    var name = "Android"
    var name2 = "Bootcamp"

    // traversing string without using index property
    for (alphabet in name)   print("$alphabet ")

    // traversing string with using index property
    for (i in name2.indices) print(name2[i]+" ")
    println(" ")

    // traversing string using withIndex() library function
    for ((index,value) in name.withIndex())
        println("Element at $index th index is $value")
}