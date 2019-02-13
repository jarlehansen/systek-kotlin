package functional

fun timeUsed(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("${end - start}ms")
}

fun main() {
    val values = listOf("a", "b", "c")
    timeUsed {
        val filteredValues = values.filter { it == "b" }
    }

    val p1 = Person("Ola", "Olsen")
    val p2 = p1.copy(lastName = "Nordmann")
}


data class Person(val firstName: String, val lastName: String)
