import java.io.File

fun main() {
    val position1 = Vec2(0, 0)
    val position2 = Vec2(0, 0)
    var aim = 0
    val input: List<String> = File("src/Day02.txt").readLines()

    for (i in 0.until(input.size)) {
        val tmpList = input[i].split(" ")

        when (tmpList[0]) {
             "forward" -> position1.x += tmpList[1].toInt()
             "down" -> position1.y += tmpList[1].toInt()
             "up" -> position1.y -= tmpList[1].toInt()
             else -> println("invalid direction")
        }

        when (tmpList[0]) {
            "down" -> aim += tmpList[1].toInt()
            "up" -> aim -= tmpList[1].toInt()
            "forward" -> {
                position2.x += tmpList[1].toInt()
                position2.y += (aim * tmpList[1].toInt())
            }
            else -> println("invalid direction")
        }
        println(tmpList)
        println(position1)
    }

    println(position1.x * position1.y)
    println(position2.x * position2.y)

}

data class Vec2(var x: Int, var y: Int)