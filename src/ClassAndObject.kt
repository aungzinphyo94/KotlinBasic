class Employee {

    var name: String = ""
    var salary: Double = 0.toDouble()

    fun insertValues(n: String, s: Double) {
        name = n
        salary = s
        println("Name of the employee: $name")
        println("Salary of the employee: $salary")
    }
    fun insertName(n: String) {
        this.name = n
    }

}
fun main(args: Array<String>) {
    // creating multiple objects 
    var obj = Employee()
    // object 2 of class employee
    var obj2 = Employee()

    //accessing the member function
    obj.insertValues("Praveen",500000.00)

    // accessing the member function
    obj2.insertName("Aliena")

    // accessing the name property of class
    println("Name of the new employee: ${obj2.name}")

}