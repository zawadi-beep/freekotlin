fun main() {
    // while loop
    var num = 200
    while (num <= 205) {
        println("Number is $num")
        num++
    }

    var num2 = 100
    while( num2 >=95){
        println ( " Number is $num2")
        num2 --
    }


    //do while loop
    var num3 = 20
    do {
        println(num3)
        num3 ++
    }while ( num3 <= 25)


    // for loop
    var furniture = arrayOf("Chair","Table","Desk")
    for (z in furniture ){
        println(z)
    }
    var marks = arrayOf ( 20,90,89,100,45,67)
    for (m in marks){
        println("Mark is $m")
    }

    for ( num4 in 30 .. 35) {
        println(num4)
    }
    for ( alpha in 'a' .. 'd'){
        println(alpha)
    }


}