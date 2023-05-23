fun main() {
    val items = listOf("Apple", "Banana", "Orange")

    for (item in items)
        println(item)

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    for (i in 1..15)
        println(i)

    for (i in 1 until 14)
        println(i)

    for (i in 13 downTo 1)
        println(i)
}