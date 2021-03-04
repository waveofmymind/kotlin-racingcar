package car.business

class CarMoveHistories : ArrayList<CarMoveHistory>() {
    fun getFrontHistories(): List<CarMoveHistory> {
        val maxPosition = this.map { it.position }
            .max()
        return this.filter { it.position == maxPosition }
    }
}
