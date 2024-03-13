fun main() {

    var languages = arrayOf("Kotlin","Python","JavaScript","C++")

    println(languages[2])

    // reassigning a value
    languages[2] = "Php"
    println(languages[2])

    //looping through an array
    for (lang in languages){

        println(lang)

    }

    //Determining whether an element exists
    if ("Php" in languages){
        println("It exists")
    }
    else{
        println("does not exist")
    }

    



}