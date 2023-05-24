fun main() {
    println(testSimple(3, 5))
    println(testString(5))
    println(testNamedArguments(y = 1, z = 5, x = 8))
    testDefaultArguments()
    testDefaultArguments(y = 2)
    println(foo("Huita"))
}

fun testSimple(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void method in Java
fun testDefaultArguments(x: Int = 1, y: Int = 9) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if(toUpperCase) name.uppercase() else name) + number
}