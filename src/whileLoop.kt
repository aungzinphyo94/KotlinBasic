fun main(args: Array<String>) {
    var number = 1

    while(number <= 10) {
        println(number)
        number++;
    }

    //Array
    var names = arrayOf("John","James","Kim","Wang","Zack","Forrest")
    var index = 0

    while(index < names.size) {
        println(names[index])
        index++
    }
}