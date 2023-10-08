class ProblemB {

    fun main() {
        val inputList = this::class.java.getResourceAsStream("problemB/input.txt")!!
            .bufferedReader().readLines()
        val inputLineCount: Int = inputList[0].toInt()

        for (i in 1..inputLineCount) {
            val lineInfoList = inputList[i].trim().splitToSequence(' ').toList()
            val lineLength: Int = lineInfoList[0].toInt() //длина выходной строки
            val maxSymbolNumber: Int = lineInfoList[1].toInt() //максимальный номер буквы

            var resultString = ""
            var lineIndex = 0
            var symbIndex = 1
            while (lineIndex < lineLength) {
                resultString += 'a' + symbIndex - 1
                lineIndex++
                symbIndex++
                if (symbIndex > maxSymbolNumber) {
                    symbIndex = 1
                }
            }
            println(resultString)
        }
    }

}