import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val words = mutableListOf<String>()

    for (i in 1..5) {
        val word = scanner.next()
        words.add(word)
    }

    for (word in words) println(word)

}