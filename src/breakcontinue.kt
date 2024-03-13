fun main() {
    //break statement
    for ( x in 50 .. 55){
        if ( x == 54){
            break
        }
        println(x)
    }

    //continue statement
    for ( alpha in 'd' .. 'h'){
        if ( alpha == 'e'){
            continue
        }
        println(alpha)
    }


}