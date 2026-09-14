package week3wed

fun main() {
    println("---Step 1 - Basic Info")
    val firstName = "Tahje"
    val major = "Computer Science"
    val favoriteFood = "Ribs"

    println (firstName)
    println (major)
    println (favoriteFood)


    println("---Step 2 - Amount of CSC courses Ive taken")
    var coursesTaken = 7
    coursesTaken += 1
    val newTemp = "Courses taken: $coursesTaken"
    println(newTemp)
    val newTempt = "Courses taken after this one: ${coursesTaken + 1}"
    println(newTempt)

    println("---Step 3 - Four Types")

    val lastName: String = "Tahje Wilson"
    val age: Int = 21
    val gpa: Double = 3.75
    val enrolled: Boolean = true

    println("---Step 4 - String Templates")

    val templateOne = "The student's first name is $firstName"
    println(templateOne)

    val templateTwo = "Next year the student will be ${age + 1} years old"
    println(templateTwo)

    val templateThree = "The length of the student's last name is ${lastName.length}"
    println(templateThree)

    println("---Step 5: Reading input---")
    print(" What is your favorite movie?")
    val favoriteMovie = readln()






}