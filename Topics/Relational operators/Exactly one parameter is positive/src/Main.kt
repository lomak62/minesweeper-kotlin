fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    var check = 0

    if (a > 0) check++
    if (b > 0) check++
    if (c > 0) check++

    println(check == 1)
}