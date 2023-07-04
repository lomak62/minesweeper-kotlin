fun checkSpeed(speed: Int, limit: Int = 60) {
    // write your code here
    println(if (speed <= limit) "Within the limit" else "Exceeds the limit by ${speed - limit} kilometers per hour")
}
