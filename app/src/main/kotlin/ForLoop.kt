// while and do-while loops in Kotlin are same as in Java
// but for-loop is an interesting one

fun main() {
    example1()
    example2()
    example3()
}

fun example1() {
    val list = listOf("a", "b", "c")

    for (s in list){
        print(s)
    }
    // Output is abc
}

fun example2() {
    for (i in 0..9){ // i taken from 0 to 9 with a default increment of 1
        print(i)
    }
    // Output: 0123456789

    for (i in 0 until 10){ // i taken from 0 to 9 with a default increment of 1
        print(i)
    }
    // Output: 0123456789

    // Use ranges (eg. 0..9) or 'until' keyword
}

fun example3() {
    for (j in 0..9 step 2){ // i taken from 0 to 9 with increment of 2
        print(j)
    }
    // Output: 02468

    for (i in 9 downTo 1 step 2){ // Reverse Loop
        print(i)
    }
    // Output: 97531
}
