package tasks

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 0, 2)
    val arr2 = intArrayOf(5, 1, 2, 7, 3, 2)
    print(getRepeatedIntersection(arr1, arr2))
}

// Function to find the repeated intersection between two arrays
fun getRepeatedIntersection(arr1: IntArray, arr2: IntArray): List<Int> {
    val s1 = arr1.toHashSet()
    val s2 = arr2.toHashSet()

    val result = mutableListOf<Int>() // List to store the repeated intersection

    for (el in s1) { // Iterate over the elements in s1
        if (s2.contains(el)) { // If the element is also present in s2
            val numOfRepeats = minOf(arr1.count { it == el}, arr2.count { it == el}) // Find the minimum number of times the element appears in both arrays
            repeat(numOfRepeats) { result.add(el) } // Add the element to the result list the required number of times
        }
    }
    return result // Return the list of repeated elements
}
