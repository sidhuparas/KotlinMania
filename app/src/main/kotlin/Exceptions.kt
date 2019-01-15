import java.io.BufferedReader
import java.io.FileReader
import java.lang.IllegalArgumentException
import kotlin.NumberFormatException

fun main(args: Array<String>) {
    noCheckedExceptions()
    tryIsAnExpression()
    throwIsAnExpression()
}

fun noCheckedExceptions() {
    // Kotlin doesn't have Checked Exceptions
    // This makes code more elegant
    val file = FileReader("C:\\test.txt") // Kotlin doesn't ask to handle FileNotFoundException here
    val fileInput = BufferedReader(file)

    print(fileInput.readLine()) // Not a must condition to handle IOException

    fileInput.close() // Again, IOException handling is optional
}

fun tryIsAnExpression() {
    val string = "95A"

    val number = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        return // No value is assigned to variable 'number' because
               // return is an expression in Kotlin with return type as Nothing
    }

    print(number)
}

fun throwIsAnExpression() {
    val number = 6
    val evenNumber =
            if (number % 2 == 0)
                number
            else
                throw IllegalArgumentException("$number isn't an even number.")
                // throw has return type as Nothing just the same as 'return'

    println(evenNumber)
}