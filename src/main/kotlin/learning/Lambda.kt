fun main() {
    val a = listOf(1, 2, 3, 4, 5, 6)

    a.forEach {e -> print(e)}
    println(a.map {e -> e * 2})
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce {sum, e -> sum + e})

    println(a.sortedByDescending{ it })
    a.any { it > 6 } // False
    a.all { it < 5} //False
    a.sum()

    val numbers = listOf(1, 2, -3, 14, -304)
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    println(listOf("a", "b", "ccc", "ad", "hrt").groupBy{ it.length })
}