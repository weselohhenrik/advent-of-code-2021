import java.io.File

fun main() {
    var result = 0

    var input: List<String> = File("src/Day01Part1.txt").readLines()
    var intList = mutableListOf<Int>()
    for (i in 0..(input.size-1)) {
        intList.add(input[i].toInt())
    }

    var a = getWindow(0, intList)
    for (i in 1..(intList.size-3)) {
        var b = getWindow(i, intList)
        if (b > a) {
            result += 1
        }
        a = b
    }

    println(result)
}

fun getWindow(index: Int, list: List<Int>): Int {
    var windowSum: Int = 0
    for (i in 0..2) {
        windowSum += list[i + index]
    }
    return windowSum
}

fun testWindow() {
    var index = 0
    var list = listOf(10, 20, 30, 40)

    var result = getWindow(index, list)
    println(result)
}