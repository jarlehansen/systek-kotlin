package extensions

fun List<String>.second(): String {
    return ""
}

fun main() {

    val values = listOf("a", "b", "c")
    println(values.first())
    println(values.second())


}