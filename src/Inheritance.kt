open class EmployeeInheritance( name: String,age: Int,salary : Int) {
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}
//derived class
class webDeveloper( name: String,age: Int,salary : Int): EmployeeInheritance(name, age,salary) {
    fun website() {
        println("I am website developer")
        println()
    }
}
//derived class
class androidDeveloper( name: String,age: Int,salary : Int): EmployeeInheritance(name, age,salary) {
    fun android() {
        println("I am android app developer")
        println()
    }
}
//derived class
class iosDeveloper( name: String,age: Int,salary : Int): EmployeeInheritance(name, age,salary) {
    fun iosapp() {
        println("I am iOS app developer")
        println()
    }
}
//main method
fun main(args: Array<String>) {
    val wd = webDeveloper("James", 25, 10000)
    wd.website()
    val ad = androidDeveloper("John", 24,12000)
    ad.android()
    val iosd = iosDeveloper("Robert", 26,15000)
    iosd.iosapp()
}