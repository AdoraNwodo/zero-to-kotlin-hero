fun main(){

    //Doing all the logic in the main so that we are not ahead of the series.


    //Numbers
    val myInt: Int = 3960
    val myDouble: Double = 300.00
    val myFloat: Float = 220.00f
    val myLong: Long = 908772223L
    val myShort: Short = 20
    val myByte: Byte = 2



    /*
    *  Kotlin has type inferencing. We don't have to write the types explicitly. However, there are restrictions
    *
    */
    val myNumber = 20
    val isFemale = true
    val alphabet = 'A'
    val myString = "This is a String"


    // Printing the type
    println("myNumber's type is ${myNumber::class.simpleName}")
    println("isFemale's type is ${isFemale::class.simpleName}")
    println("alphabet's type is ${alphabet::class.simpleName}")
    println("myString's type is ${myString::class.simpleName}")

}