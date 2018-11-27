class Car(brand: String){

    init{
        println("The car brand is $brand")
    }

    constructor(brand: String, color: String): this(brand){
        println("In the secondary constructor of a $color $brand car")
    }

    class NestedCar{

        fun welcome(){
            print("Welcome to the Nested Car class")
        }

    }

    fun turnOnIgnition(){
        println("Ignition is now on...")
    }
}