
//define a class with a public constructor
class publicClass(s: String) {

    init{
        println("Hello, you are in the public class and your message is $s")
    }
}


//define a class with a private constructor
class privateClass private constructor(s: String) {

    init{
        println("Hello, you are in the private class and your message is $s")
    }

}


//define a class with a protected constructor
class protectedClass protected constructor(s: String) {

    init{
        println("Hello, you are in the private class and your message is $s")
    }

}

//define a class with an internal constructor
class internalClass internal constructor(s: String) {

    init{
        println("Hello, you are in the private class and your message is $s")
    }

}