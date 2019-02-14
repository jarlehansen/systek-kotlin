package nullsafety

class B(val c: String?)
class A(val b: B?)

fun main() {

    var value = "abc"



    val a = A(B(null))

    // if(a != null && a.b != null && a.b.c != null)

}