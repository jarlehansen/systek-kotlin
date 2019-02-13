package nullsafety

class B(val c: String?)
class A(val b: B?)

fun main() {

    val value = "abc"

    val a = A(B(null))

}