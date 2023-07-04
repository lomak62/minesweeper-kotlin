class City(val name: String) {
    var degrees: Int = 0
}        

fun main() {

    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()

    val firstCity = City("Dubai")
    firstCity.degrees = first
    if (first !in -92..57) firstCity.degrees = 30

    val secondCity = City("Moscow")
    secondCity.degrees = second
    if (second !in -92..57) secondCity.degrees = 5

    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    if (third !in -92..57) thirdCity.degrees = 20

    // implement comparing here
    var coldestCity = firstCity.name
    var coldestTemp = firstCity.degrees

    if (secondCity.degrees < coldestTemp) {
        coldestCity = secondCity.name
        coldestTemp = secondCity.degrees
    }
    if (thirdCity.degrees < coldestTemp) {
        coldestCity = thirdCity.name
        coldestTemp = thirdCity.degrees
    }
    var count = 0
    if (coldestTemp == firstCity.degrees) count++
    if (coldestTemp == secondCity.degrees) count++
    if (coldestTemp == thirdCity.degrees) count++
    if (count > 1) coldestCity = "neither"

    println(coldestCity)

}