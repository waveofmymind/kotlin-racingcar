package racingcar

import racingcar.model.RacingCarGame
import racingcar.strategy.RandomMoveStrategy
import racingcar.utils.InputUtils

fun main() {
    val inputDto = InputUtils.askQuestions()

    val moveStrategy = RandomMoveStrategy()
    val racingCarGame = RacingCarGame.ready(inputDto.carNames, moveStrategy)

    for (i in 1..inputDto.gameCount) {
        val resultViews = racingCarGame.moveOnce()
        resultViews.printResults()
    }

    val finalResultView = racingCarGame.finish()
    finalResultView.printResult()
}
