package learning

fun main() {
    val child = Person("Bobus", "Sardobus", 12)
    val per1 = Person("Imya", "Familiya", 34, child)

    println(per1.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2)
}

// Primary constructor
class Person(val firstName: String, val surname: String, var age: Int) {
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

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // This
        set(value) {
            if (value < 0) println("Negative")
            field = value
        }
    fun area() = height * length
}