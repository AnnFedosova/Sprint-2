class ProblemA {

    fun main() {
        val inputList = this::class.java.getResourceAsStream("problemA/input.txt")!!
            .bufferedReader().readLines()
        val frogCount: Int = inputList[0].toInt()
        for (i in 1..frogCount) {
            val frogInfoList = inputList[i].trim().splitToSequence(' ').toList()
            val rightJumpLength: Int = frogInfoList[0].toInt() //длина прыжка вправо
            val leftJumpLength: Int = frogInfoList[1].toInt() //длина прыжка влево
            val jumpCount: Int = frogInfoList[2].toInt() //кол-во прыжков

            var resultCoordinate = 0L

            for (j in 1..jumpCount) {
                if (j % 2 == 0) {
                    resultCoordinate -= leftJumpLength
                } else {
                    resultCoordinate += rightJumpLength
                }
            }
            println(resultCoordinate)
        }
    }

}