package backyard

inline fun g(bad: Boolean, body: () -> Unit) {
    println("Starting")
    body()
    if (bad) throw IllegalArgumentException("oops!")
}

fun main() {
    g(false) { println("Yeah!") }
    g(true) { println("Yeah!") }  // Exception at line 19 - not the more useful 6 and 11 (without inlining)
}