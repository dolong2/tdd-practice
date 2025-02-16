import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestScenario {
    @Test
    @DisplayName("정답인 경우")
    fun answerTest() {
        val ballNumbers = BallNumbers(setOf(BallNumber(1), BallNumber(2), BallNumber(3)))
        val game = Game(ballNumbers)
        val gameService = GameService(mutableListOf(game))

        val result = gameService.checkAnswer(setOf(1, 2, 3))
        assertEquals(result, true)
    }
}