//return type
fun mul(a: Int, b: Int): Int {
    var number = a.times(b)
    return number
}

//not return type
fun student( name: String , grade: Char , roll_no: Int) {
    println("Name of the student is : $name")
    println("Grade of the student is: $grade")
    println("Roll no of the student is: $roll_no")

}

fun main(args: Array<String>) {
    var result = mul(3,5)
    println("The multiplication of two numbers is: $result")

    val name = "Praveen"
    val rollno = 25
    val grade = 'A'
    student(name,grade,rollno)
    student("Gaurav",'B',30)
}