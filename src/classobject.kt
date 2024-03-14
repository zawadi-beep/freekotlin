class Person{
    //attributes or properties
    var name = "John"
    var age = 34
    var gender = "Male"

    //methods or functions
    fun walk(){
        println("Person is walking")
    }
}

fun main() {
    var accountant = Person()
    accountant.walk()

    println(accountant.gender)


}