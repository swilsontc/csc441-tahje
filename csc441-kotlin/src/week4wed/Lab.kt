package week4wed

fun main () {
    println("---Step 1: Describe today")
    describeToday()

    println("---Step 2: Favorite thing")
    println(favouriteThing())

    println("---Step 3: pick One")
    println(pickOne(number = 3))
    println("---Step 4: pick One Short")
    println(pickOneShort(number = 3))

    println("---Step 5: pick with default")
    println(pickWithDefault(number = 2, name = "Tahje"))
    println(pickWithDefault())
    println(pickWithDefault(name = "Jack"))



}
fun describeToday() {
    println("Today was alright")
}

fun favouriteThing(): String {
    return("My favorite thing is my family")
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "Spring"
        2 -> "Summer"
        3 -> "Autumn"
        4 -> "Winter"
        else -> "Undefined"
    }

}
fun pickOneShort(number: Int): String = when (number) {
    1 -> "Spring"
    2 -> "Summer"
    3 -> "Autumn"
    4 -> "Winter"
    else -> "Undefined"

}

fun pickWithDefault(number: Int = 1, name: String = "you"): String {
    val season = when (number) {
        1 -> "Spring"
        2 -> "Summer"
        3 -> "Autumn"
        4 -> "Winter"
        else -> "Undefined"
    }
    return "$name chose $season"

}