fun verificationCode(): String {
    // use these letters to create the code
    val letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"
    val verificationCodeLength = 10
    var code = ""

    // complete the function and then return the code
    repeat(verificationCodeLength) {
        val randomIndex = Random.nextInt(letters.length)
        code += letters[randomIndex]
    }
    return code
}
