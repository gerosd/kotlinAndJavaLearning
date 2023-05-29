fun main() {
    val a = listOf(1, 2, 3, 4, 5, 6)

    a.forEach {e -> print(e)}
    println(a.map {e -> e * 2})
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce {sum, e -> sum + e})
}