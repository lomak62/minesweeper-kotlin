// write your class here
class ArithmeticOperations(val x: Int = 0, val y: Int = 0) {

    fun addition(): Int {
        return x + y
    }

    fun subtraction(): Int {
        return x - y
    }

    fun multiplication(): Int {
        return x * y
    }

    fun division(): Int {
        return if (y != 0) x / y else 0
    }

}
