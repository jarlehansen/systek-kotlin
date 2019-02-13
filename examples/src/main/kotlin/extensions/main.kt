package extensions

fun List<String>.second() =
    if (this.size > 1) {
        this[1]
    } else {
        ""
    }

fun main() {

    val values = listOf("a", "b", "c")
    println(values.first())
    println(values.second())


}