@file:Suppress("ConstantConditionIf")

/*
    const are compile-time constants while val are such constants whose
    values can be assigned at runtime
*/
const val marksInMaths: Int = 56
const val marksInScience: Int = 89

fun main() {
    printUsingStringTemplate()
    executeIfElseExpression()
    executeWhenExpression()
}

fun printUsingStringTemplate() {
    val totalMarks = marksInMaths + marksInScience

    println("My marks in Maths are $marksInMaths while I scored $marksInScience in Science. " +
            "Overall my total is $totalMarks")

    println("Highest marks are ${if (marksInMaths > marksInScience) marksInMaths else marksInScience}")
}

fun executeIfElseExpression() {
    // The if-else expression is returning an Int and hence variable highestMarks is of type Int

    val highestMarks = if (marksInMaths > marksInScience) marksInMaths else marksInScience

    // If you need to execute some code along with returning some value, use this way
    val highestMarksAgain =
            if (marksInMaths > marksInScience) {
                println("The last line is returned and you can put any code here")
                marksInMaths
            } else {
                println("The last line is returned and you can put any code here")
                marksInScience
            }

    println("Highest Marks are $highestMarks")
}

fun executeWhenExpression() {
    // There's no switch statement in Kotlin. 'when' statement is much more concise compared to switch statement

    val totalMarks = marksInMaths + marksInScience

    when (totalMarks) {
        100 -> println("Good score but I'm not impressed")
        120 -> println("That's a great score")
        140 -> { // For multiline code, use braces {}
            println("Well, you are really intelligent")
            println("You have a bright future")
        }

        else -> println("You're out of the world :)") //else is optional
    }

    // When Expression returns the result and hence it can be used this way as well
    val totalMarksAsString = when (totalMarks) {
        100 -> "Good score but I'm not impressed"
        120 -> "That's a great score"
        140 -> { // For multiline code, use braces {}
            println("If you have multiline code, the last value is assigned to the variable")
            "You have a bright future" //This value is gonna be assigned
        }

        else -> "You're out of the world :)" //else is NOT optional now
    }

    println(totalMarksAsString)
}
