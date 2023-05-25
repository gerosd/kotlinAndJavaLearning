fun main() {
    val a = "Hello"
    // a = null //NPE невозможно
    println(a.length)

    var b:String? = "Test"
    b = null
    /** @return length if b != null
     * @return else b == null
     */
    // b?.length

    // Elvis operator - ?:
    val elvis = b?.length ?: -1
}