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