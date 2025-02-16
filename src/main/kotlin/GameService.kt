class GameService(
    val gameList: MutableList<Game>
) {

    fun checkAnswer(inputSet: Set<Int>): Boolean {
        val game = gameList.last()
        val ballNumbers = game.ballNumbers

        var ballCnt = 0
        var strikeCnt = 0
        inputSet.forEachIndexed { index, i ->
            when {
                ballNumbers.isStrike(i, index) -> {
                    strikeCnt ++
                    return@forEachIndexed
                }
                ballNumbers.isBall(i) -> {
                    ballCnt++
                    return@forEachIndexed
                }
            }
        }

        return if (strikeCnt == 3) {
            println("정답입니다.")
            true
        }
        else {
            if (ballCnt == 0 && strikeCnt == 0)
                println("낫싱")
            else {
                if (ballCnt != 0) {
                    println("${ballCnt}볼 ")
                }
                if (strikeCnt != 0) {
                    println("${strikeCnt}스트라이크")
                }
            }

            false
        }
    }
}