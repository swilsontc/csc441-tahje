package week4fri

fun main () {
    println("---Step 1: two names ---")
    val firstName: String = "Tahje"
    val lastName: String? = null

    println(firstName.length)

    println("---Step 2: a safe call ---")
    println(lastName?.length)

    println("---Step 3: Elvis operator ---")
    println(lastName?.length ?: 0)

    println("---Step 4: Let block ---")
    lastName?.let {
        println("Last name is : $it")
    }

    firstName?.let {
        println("Last name is : $it")
    }


    println("---Step 5: toIntorNull ---")
    val notAValue = "butter".toIntOrNull()
    println(notAValue ?: "that wasn't a number")

    println("---Step 6: listOf ---")
    val supplyList = listOf("Computer", "Pen", "Mouse", "Notebook")
    println(supplyList)

    println("---Step 7: mutable Llist ---")
    val toDoList = mutableListOf("Gym", "School", "Homework")

    toDoList.add("Taxes")
    toDoList.remove("Gym")
    println(toDoList)
    println("Items : ${toDoList.size}")

    println("---Step 8: a list of numbers ---")
    val numberList = listOf(64, 23, 93, 48, 57, 66, 27, 81, 19, 10)
    println(numberList.sum())
    println(numberList.average())
    println(numberList.filter{ it >= 50})




}