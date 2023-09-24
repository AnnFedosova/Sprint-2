class ProblemC {

    fun main() {
        val inputList = this::class.java.getResourceAsStream("problemC/input.txt")!!
            .bufferedReader().readLines()
        val studentsLevelList: List<Int> = inputList[1].trim().splitToSequence(' ')
            .toList()
            .stream()
            .map { a -> a.toInt() }
            .sorted()
            .toList()

        var resultTaskCount = 0 //кол-во задач, которые нужно решить группе студентов
        var i = 0
        while (i < studentsLevelList.size) {
            resultTaskCount += studentsLevelList[i + 1] - studentsLevelList[i]
            i += 2
        }
        println(resultTaskCount)
    }

}