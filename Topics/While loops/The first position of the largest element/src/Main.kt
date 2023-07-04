import java.util.*

var largest = 0
var position = 0
var occurrence = 0
fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        occurrence++
        if (next > largest || occurrence == 1) {
            largest = next
            position = occurrence
        }
    }
    println("$largest $position")
}