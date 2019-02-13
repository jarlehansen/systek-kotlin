package dataclasses

data class KotlinPerson(val firstName: String, val lastName: String, val address: String)

fun main() {
    val p1 = Person()
    p1.firstName = "Ola"
    p1.lastName = "Olsen"
    p1.address = "Veien 1"

    val p2 = KotlinPerson("Kari", "Hansen", "Veien 2")
}