fun main() {
    try {
        // write your code here, do not touch the lines above
        val example = 2 / 0
        println(example)
        // do not touch the lines below
    } catch (e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}