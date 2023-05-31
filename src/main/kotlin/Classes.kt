fun main() {
    val child = Person("Bobus", "Sardobus", 12)
    val per1 = Person("Imya", "Familiya", 34, child)
}

// Primary constructor
class Person(private val firstName: String, val surname: String, var age: Int) {
    private var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created wit' name $firstName")
    }

    constructor(firstName: String, surname: String, age: Int, child: Person) :
            this(firstName, surname, age) {
        children.add(child)
    }

    constructor(): this("", "", 0)
}

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // This
        set(value) {
            if (value < 0) println("Negative") else println("Positive")
        }
}