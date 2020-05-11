package backyard

inline fun f(body: () -> Unit) {
    println("Starting")
    body()
    throw IllegalArgumentException("oops!")
}

fun main() {
    f { println("Yeah!") }    // Exception at line 14 !?!  Not at 6 and 10 (as would be without inlining)
}