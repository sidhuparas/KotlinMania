@file:Suppress("ConstantConditionIf")

package Test

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    testFun(3)
    testFun(4)
    testFun(1)
}

@Throws(NumberFormatException::class)
fun testFun(i: Int) {
    if (i > 2)
        print(i)
    else
        throw NumberFormatException("Something bad")
}