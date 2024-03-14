// parent class
open class shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//child class
class Rhombus:shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}

class Circle:shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}

fun main() {
    var s = shape()
    s.draw()
    var r = Rhombus()
    r.draw()
    var c = Circle()
    c.draw()


}