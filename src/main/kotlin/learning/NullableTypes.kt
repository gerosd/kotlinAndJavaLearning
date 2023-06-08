fun main() {
    val a = "Hello"
    // a = null //NPE невозможно
    println(a.length)

    var b:String? = "Test"
    /** @return length if b != null
     * @return else b == null
     */
    // b?.length

    // Elvis operator - ?:
    val elvis = b?.length ?: -1

    b = if ((0..10).random() > 5) "asd" else null

    // !! if null -> NPE
    val t = b!!.length
}