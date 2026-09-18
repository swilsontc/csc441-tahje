package week4fri

fun main () {
    println("---Step 1: two kinds of string ---")
    val firstName: String = "Tahje"
    val middleName: String? = null

    println(firstName.length)
    println(middleName?.length)

    println("---Step 2: Safe call ---")
    println(middleName?.length)


    println("---Step 3: Elvis ---")
    println(middleName?.length ?: 0)

    println("---Step 4: let ---")
    middleName?.let {
        println("Middle name is : $it")

    }

    println("---Step 5: the risky one ---")
    val maybeNumber: Int? = 100
    println(maybeNumber!! + 1)

    println("---Step 6: Where nulls actually come from ---")
    val notANumber = "banana".toIntOrNull()
    println(notANumber ?: "that wasn't a number")

    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
    println(capitals["Canada"] ?: "not in the map")

    val empty = listOf<Int>()
    println(empty.maxOrNull() ?: "empty list")

    println("--- Step 7: list and MutableList ---")
    val shoppingList = listOf("bread", "butter", "water")
    val toDoList = mutableListOf("homework", "laundry")

    toDoList.add("dishes")
    toDoList.remove( element = "laundry")

    println(shoppingList)
    println(toDoList)
    println("Items: ${toDoList.size}")

//    shoppingList.add("milk")
    println("--- Step 8: things lists can do ---")
    val scores = listOf(90, 72, 85, 64, 98)
    println(scores.sum())
    println(scores.average())
    println(scores.maxOrNull())
    println(scores.sorted())
    println(scores.filter{ it >= 80})


//
//
//

}
