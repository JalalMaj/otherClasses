fun main(args: Array<String>) {
    val myCar = Car()
    myCar.drive()
}


class Car{
    private val engine = Engine() // Create an instance of inner class , private is not observed to outer world
    var speed = 300
    fun drive() {
        engine.run()
        println("Driving @ speed $speed kph")
    }
    private inner class Engine {
        val rpm = 1000
        fun run() {
            println("Engine is running @ $rpm rpm")
            this@Car.speed = 100
            //this@Car.drive()
        }
    }
}