import kotlin.streams.asStream

class ProblemD {

    fun main() {
        val inputStrList: MutableList<String> = this::class.java.getResourceAsStream("problemD/input.txt")!!
            .bufferedReader().readLines().toMutableList()
        if (inputStrList.removeAt(0) < 1.toString()) {
            return
        }
        for (i in 1 until inputStrList.size step 2) {
            val clientMoneyList: List<Long> =
                inputStrList[i].trim().splitToSequence(' ').asStream()
                    .map { str -> str.toLong() }.sorted(reverseOrder()).toList()
            println(getMaxIncome(clientMoneyList))
        }
    }

    private fun getMaxIncome(clientMoneyList: List<Long>): Long {
        var maxIncome = 0L
        for (i in clientMoneyList.indices) {
            val price = clientMoneyList[i]
            val income = price * (i + 1)
            if (income > maxIncome) {
                maxIncome = income
            }
        }
        return maxIncome
    }

}