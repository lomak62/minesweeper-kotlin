fun main() {
    // put your code here
    val word = readln()
    println(word.last() + word.substring(1, word.lastIndex) + word.first())
}