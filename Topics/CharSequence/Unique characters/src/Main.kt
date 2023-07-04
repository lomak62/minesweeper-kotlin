fun countUniqueChars(sequence: CharSequence): Int {
    // write your code here
    var unique = ""
    for (c in sequence) {
        if (unique.contains(c)) continue
        unique += c
    }
    return unique.length
}
