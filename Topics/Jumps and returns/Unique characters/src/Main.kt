fun main() {
    // put your code here
    val word = readln()
    var count = 0
    for (c in word) if (word.count { it == c } == 1) count++
    println(count)
}