fun main() {
    // write your code here
    val setOfNumbers = mutableSetOf<Int>()
    val n = readln().toInt()

    for (i in 1..n) {
        setOfNumbers.add(readln().toInt())
    }
    val m = readln().toInt()
    if (setOfNumbers.contains(m)) {
        println("YES")
    } else
        println("NO")
}