import java.util.concurrent.BrokenBarrierException

/**
 * Exercise: Enum classes
The medals in the olympics are

GOLD - 1st place

SILVER - 2nd place

BRONZE - 3rd place

NONE - other

Create a class Olympics that has a function which returns the medal a contestant won based on the position
they finished on.
It also has a function which returns the position of a contestant based on the medal they won.
Create an object of that class and call its methods.
 */

enum class Medal(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olymbics {
    fun getMedal(position: Int): Medal {
        return when (position) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }

    fun getPosition(medal: Medal) = medal.position
}

fun main(args: Array<String>) {
    val olymbics = Olymbics()
    for (i in 1..10) {
        var medal = olymbics.getMedal(i)
        println("$i gets medal $medal who is in position number ${olymbics.getPosition(medal)}")
    }
}