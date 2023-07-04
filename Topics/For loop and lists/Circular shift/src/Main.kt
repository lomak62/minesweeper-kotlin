fun main() {
    // write your code here
    val numbers = MutableList(readln().toInt()) { readln().toInt() }
    numbers.add(0, numbers.removeLast())
    println(numbers.joinToString(" "))
}