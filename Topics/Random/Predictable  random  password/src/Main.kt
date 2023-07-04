import kotlin.random.Random

fun generatePredictablePassword(seed: Int): String {
    val randomPassword = Random(seed)
    val passwordLength = 10
    val passwordChars = mutableListOf<Char>()
    // write your code here
    for (i in 1..passwordLength) passwordChars.add(randomPassword.nextInt(33, 127).toChar())
    return passwordChars.joinToString("")
}
