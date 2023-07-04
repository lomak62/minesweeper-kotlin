fun removeEveryOtherChar(input: CharSequence): CharSequence {
    // write your code here
    var newCharSequence = ""
    for (i in input.indices step 2) {
        newCharSequence += input[i]
    }
    return newCharSequence
}
