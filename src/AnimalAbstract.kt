open class Livingthings {
    open fun eat() {
        println("All living things eat")
    }
}
abstract class Animal : Livingthings() {
    override abstract fun eat()
}
class Dog: Animal(){
    override fun eat() {
        println("Dog can also breathe")
    }
}
fun main(args: Array<String>){
    val lt = Livingthings()
    lt.eat()
    val d = Dog()
    d.eat()
}