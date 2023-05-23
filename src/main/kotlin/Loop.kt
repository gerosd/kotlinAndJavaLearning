fun main() {
    val items = listOf("Apple", "Banana", "Orange")

    for (item in items)
        println(item)

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }
}