package backyard

inline fun h(body: () -> Unit) {
    println("Starting")
    body()
}

fun main() {
    h() {
        println("Yeah!")
        throw IllegalArgumentException("oops!")   // Exception at line 11 - OK
    }
}
