// parent class
class shape{
    fun draw(){
        println("Drawing a shape")
    }
}

class Rhombus{
    fun draw(){
        println("Drawing a rhombus")
    }
}

class Circle{
    fun draw(){
        println("Drawing a circle")
    }
}

fun main() {
    var s = shape()
    var r = Rhombus()
    var c = Circle()


}