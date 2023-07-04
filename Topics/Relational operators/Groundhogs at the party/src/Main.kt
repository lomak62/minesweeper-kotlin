const val CONST_1 = 10
const val CONST_2 = 20
const val CONST_3 = 15
const val CONST_4 = 25
const val CONST_5 = true

fun main() {
    // write your code here
    val c = readln().toInt()
    val w = readln().toBoolean()

    println(c >= CONST_1 && c <= CONST_2 && w != CONST_5 || c >= CONST_3 && c <= CONST_4 && w == CONST_5)
}