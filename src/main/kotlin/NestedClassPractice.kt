fun main() {
    val myComputer = Computer()
    myComputer.bootUp()

}

class Computer{
    val windows = OperatingSystem()
    fun bootUp() {
        println("Computer is booting")
        windows.start()
    }
    inner class OperatingSystem{
        fun start() {
            println("OS is started")
        }
    }
}