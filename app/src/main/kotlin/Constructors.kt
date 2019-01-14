fun main(args: Array<String>) {

    // 1. Primary Constructor
    val paras = Person("Paras")
    paras.tellName()

    logDashedLine()

    // 2. Primary Constructor with 'constructor' keyword
    val alien = Alien("Paras")
    alien.tellName()

    logDashedLine()

    // 3. Secondary Constructor
    val superHuman = SuperHuman("Paras")
    superHuman.tellName()

    logDashedLine()

    // 4. Multiple Secondary Constructors
    val superAlien = SuperAlien("Paras", "Anything")
    superAlien.tellName()

    logDashedLine()

    // 5. Init Blocks
    val yetAnotherPerson = YetAnotherPerson("Paras")
    yetAnotherPerson.tellName()

    logDashedLine()

    // 6. Primary Constructor + Secondary Constructor
    val yetAnotherAlien = YetAnotherAlien()
    yetAnotherAlien.tellName()
}

// Primary Constructor is defined in the class header itself
// Standard way to define a constructor without keyword (Primary Constructor)
class Person(var name: String) {

    fun tellName() {
        println("My name is $name")
    }
}

// Also works but constructor keyword is redundant
class Alien constructor(var name: String) {

    fun tellName() {
        println("My name is $name")
    }
}

// Secondary Constructor
class SuperHuman {

    private var name: String

    constructor(name: String) {
        this.name = name
    }

    fun tellName() {
        println("My name is $name")
    }
}

// Call constructor from within another constructor
class SuperAlien {

    private var name: String

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: String) : this(name) {
        println("Age is just a number")
    }

    fun tellName() {
        println("My name is $name")
    }
}

// Init blocks
class YetAnotherPerson(var name: String) {

    init {
        // Do any logic computations here
        println("Init block called")
    }

    init {
        // Init blocks are called in the order they appear
        println("Init block called yet again")
    }

    fun tellName() {
        println("My name is $name")
    }
}

// Init blocks
class YetAnotherAlien(var name: String) {

    init {
        // Do any logic computations here
        println("Init block called")
    }

    init {
        // Init blocks are called in the order they appear
        println("Init block called yet again")
    }

    constructor() : this("(No name passed)"){
        println("Empty constructor called")
    }

    fun tellName() {
        println("My name is $name")
    }
}

fun logDashedLine(){
    println("-------------------------------")
}