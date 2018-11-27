fun main(){
    println("Primary Constructor......")
    val mycar = Car("Toyota")                          //primary constructor

    println("\nSecondary Constructor......")
    val mybluecar = Car("Toyota", "blue")       //secondary constructor


    mycar.turnOnIgnition()          //Calling a function

    Car.NestedCar().welcome()       //Calling a nested class

    val newClass = NewClass()
    newClass.play()
}

open class SuperClass{

    open fun play(){
        println("Yay. Let's play chess.")
    }

}

open class NewClass : SuperClass() {

    override fun play(){
        println("Chess is boring. Let's play checkers")
    }

}