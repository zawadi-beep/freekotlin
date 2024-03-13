fun main() {
    var greeting = "Hello world"
    var fname = "Prudence"
    var lname = "Zawadi"

    //String concatenation
    println(fname +" " +lname)
    println(fname.plus(lname))

    //Accessing an element in a string
    println(greeting[6])

    //Determining an index position of an element
    println(greeting.indexOf("world"))
    println(greeting.indexOf('H'))

    //modifying a string
    println(greeting.uppercase())

    //string interpolation
    println("Hello there, my name is $fname $lname")

    //Determining size of a string
    println(greeting.length)

}