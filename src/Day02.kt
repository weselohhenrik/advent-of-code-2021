import java.io.File

fun main() {
    val position = Vec2(0, 0)
    val input: List<String> = File("src/Day02.txt").readLines()

    for (i in 0.until(input.size)) {
        val tmpList = input[i].split(" ")

        when (tmpList[0]) {
             "forward" -> position.x += tmpList[1].toInt()
             "down" -> position.y += tmpList[1].toInt()
             "up" -> position.y -= tmpList[1].toInt()
             else -> println("invalid direction")
        }
        println(tmpList)
        println(position)
    }

    println(position.x * position.y)

}

data class Vec2(var x: Int, var y: Int)