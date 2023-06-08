fun main() {
    testWhen(23)
    testWhen("asd2")
    testWhen(15)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("10-20")
        is String -> println("String with ${input.length} symbols")
        else -> println("Idk")
    }
}