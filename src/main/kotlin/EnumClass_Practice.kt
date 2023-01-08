enum class Game {
    STARTED,
    PLAYING,
    GAMEOVER
}

fun changeState(currentState: Game): Game {
    return when (currentState) {
        Game.STARTED -> Game.PLAYING
        Game.PLAYING -> Game.GAMEOVER
        Game.GAMEOVER -> Game.STARTED
    }
}


fun main(args: Array<String>) {
    var currentState: Game = Game.PLAYING
    for(i in 1..10) {
        println("${currentState.ordinal + 1}. $currentState")
        currentState = changeState(currentState)
    }
}
