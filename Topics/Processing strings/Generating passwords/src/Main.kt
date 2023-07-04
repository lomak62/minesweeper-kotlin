import kotlin.random.Random

fun main() {
    // write your code here
    val upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowerCase = "abcdefghijklmnopqrstuvwxyz"
    val digits = "0123456789"
    var charSequence = "$"

    var (a, b, c, n) = readln().split(" ").map { it.toInt() }
    var d = n - (a + b + c)
    if (d > 0) {
        while (d > 0) {
            a += 1
            d--
            if (d > 0) {
                b += 1
                d--
            }
            if (d > 0) {
                c += 1
                d--
            }
        }
    }

    var ch: String
    for (i in 0 until n) {
        if (a > 0) {
            while (true) {
                ch = upperCase[Random.nextInt(26)].toString()
                if (charSequence.last().toString() != ch) break
            }
            charSequence += ch
            a--
        }

        if (b > 0) {
            while (true) {
                ch = lowerCase[Random.nextInt(26)].toString()
                if (charSequence.last().toString() != ch) break
            }
            charSequence += ch
            b--
        }
        if (c > 0) {
            while (true) {
                ch = digits[Random.nextInt(10)].toString()
                if (charSequence.last().toString() != ch) break
            }
            charSequence += ch
            c--
        }
    }
    val password = charSequence.substring(1)
    println(password)

}