fun main() {
    // put your code here
    val largeString = """
{
    "firstName": "John",
    "lastName": "Smith",
    "age": 35,
    "phoneNumbers": [
        {
            "type": "mobile",
            "number": "123 567-7890"
        }
    ]
}
    """.trimIndent() // removes the first and the last lines and trims indents

    print(largeString)
}