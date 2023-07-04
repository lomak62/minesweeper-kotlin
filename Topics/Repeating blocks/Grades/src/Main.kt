fun main() {
    // put your code here
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    val n = readln().toInt()
    repeat(n) {
        val i = readln().toInt()
        when (i) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")
}