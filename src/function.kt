fun main() {

    //Predefined functions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(67,89)
    println(y)

    var z = Math.round(45.98)
    println(z)

    name()
    product(89,6)
    details("Kenya",23)
    details("Amanda",34)

}

//user-defined function

fun name(){
    println("Zawadi")

}

fun product(num1:Int,num2:Int){

    println (num1 * num2)

}

fun details(name:String,age:Int){
    println("$name is $age years old")

}

