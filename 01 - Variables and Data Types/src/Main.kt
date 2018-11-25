fun main(){

    //Doing all the logic in the main so that we are not ahead of the series.


    //Numbers
    var myInt: Int = 3960
    val myDouble: Double = 300.00
    val myFloat: Float = 220.00f        //f suffix
    val myLong: Long = 908772223L       //L suffix
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
    val bytes = 0b11010010_01101001_10010100_10010010


    // Printing the type
    println("myNumber's type is ${myNumber::class.simpleName}")         //Int type
    println("isFemale's type is ${isFemale::class.simpleName}")         //Boolean type
    println("alphabet's type is ${alphabet::class.simpleName}")         //Char type
    println("myString's type is ${myString::class.simpleName}")         //String type


    //Other Literals - Hexadecimals and binaries (Octals are NOT supported)
    val hexa = 0xFFECDE5E
    val binary = 0b11010010011010011001010010010010

    //they can also be defined with underscores
    val hexa_ = 0xFF_EC_DE_5E
    val binary_ = 0b11010010_01101001_10010100_10010010
    println(".................................................");
    println("The value of hexa is $hexa without the underscore and $hexa_ with the underscore")
    println("The value of binary is $binary without the underscore and $binary_ with the underscore")
    println("The underscores just help the readability of our code")


    /*
    * We can't do this - myInt = myByte (Type mismatch)
    */
    //myInt = myByte    //uncomment to see error
    //but we can do
    myInt = myByte.toInt()      //explicit conversion


    /*
    * ARRAYS
    */
    val myIntArray: IntArray = intArrayOf(1, 2, 3)
    val anotherIntArray: Array<Int> = arrayOf(10, 20, 30)
    val myCharArray:  CharArray = charArrayOf('1', 'a', 'G')

    println(".................................................");
    for(a in myIntArray){
        print("$a ")
    }
    println("")
    for(a in anotherIntArray){
        print("$a ")
    }
    println("")
    for(a in myCharArray){
        print("$a ")
    }

    /*
    * RAW STRINGS
    */
    val myRawString = """
        This is a raw string


        See there are two line breaks before this phrase              and some space before the last part of this sentence




         Yayy
    """

    println(myRawString)


}