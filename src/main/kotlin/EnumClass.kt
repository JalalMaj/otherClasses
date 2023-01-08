enum class Colors {
    Red,
    Green,
    Blue
}

enum class Colors1(val timesUsed: Int) {
    RED(64),
    GREEN(18),
    BLUE(2)
}

fun decide(color: Colors): String {
   return when (color) {
       Colors.Red -> "you chose red color"
       Colors.Blue -> "you chose blue color"
       Colors.Green -> "you chose green color"
    }
}

fun main(args: Array<String>) {
    val color = Colors.Red
    println(decide(color))

    println(Colors1.RED.name)
    println(Colors1.GREEN.timesUsed)
    println(Colors1.BLUE.ordinal)
}