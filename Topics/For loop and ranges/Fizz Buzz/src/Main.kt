fun main() {
    // put your code here
    val first = readln().toInt()
    val last = readln().toInt()

    for (i in first..last) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}