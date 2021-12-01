import java.io.File

fun main() {
    var result: Int = 0;
    val input: List<String> = File("src/Day01Part1.txt").readLines()

    var a: Int = input[0].toInt()
    for (i in 1..(input.size - 1)) {
        val b: Int = input[i].toInt()
        if (b > a) {
            result += 1
        }
        a = input[i].toInt()
        //println(input[i])
    }

    //println(input)


    println(result);
}