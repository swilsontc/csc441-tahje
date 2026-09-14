package week3fri
fun main() {
    println("---Step 1 - range loop")
    for (i in 1..10) {
        print("$i ")
    }
    println("\n ---Step 2 - countdown")
    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }

    println("\n---Step 3 - list ")

    val tripList = mutableListOf("Entertainment", "Food", "Clothes", "Blanket")

    println("---Step 4 - print the list two different ways")
    for (item in tripList) {
        println(item)
    }

    for ((index, item) in tripList.withIndex()) {
        println("$index : $item")
    }
    tripList.forEachIndexed { index, item ->
        println("$item ")
    }
    println("---Step 5 - loop using until")
    for (i in 0 until tripList.size) {
        println("$i : ${tripList[i]}")
    }
    println("---Step 6 -when with a subject")
    val day = 3
    val dayVal = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Unknown"
    }
    println("Day $day is $dayVal")

    println("---Step 7 - a val assigned from an if")
    val moneySpent = 1500.96
    val budget = if (moneySpent > 100.00) "Over budget" else "Under budget"
    println(budget)


}
