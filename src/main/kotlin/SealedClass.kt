fun main(args: Array<String>) {
    val somePlant = getPlant()
    when(somePlant) {
        is Fruit -> println("sweet")
        is Vegetable -> println("tasty")
    }
}

abstract class Plant

sealed class Fruit: Plant()

class Apple: Fruit()

sealed class Vegetable: Plant()

class Potato: Vegetable()

fun getPlant(): Plant = Apple()