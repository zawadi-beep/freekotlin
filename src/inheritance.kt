// parent class/super class/ base class
open class animal{
    var age = 2
    var gender = "Female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//child class/Sub-class/derived class
open class Duck:animal(){
    var colour = "white"

    fun sound(){
        println("Duck is quacking")
    }


}

class fish:Duck(){
    var hasScales = true
    var hasFins = true

    fun eat(){
        println ("Fish is eating")
    }
}

fun main() {
    var a = animal()
    
    var d = Duck()

    println(d.move("Swim"))

    var nileperch = fish()

}