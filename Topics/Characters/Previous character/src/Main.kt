fun main() {
    // write your code here
    val mutableListC = mutableListOf<Char>()
    for (n in 1..4) mutableListC.add(readln().first())
    for (c in mutableListC) println(c - 1)
}