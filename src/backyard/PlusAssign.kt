package ch07

data class PlusAssign(var x: Int) {

    operator fun plus(other: PlusAssign): PlusAssign {
        println("Calling plus")
        return PlusAssign(x + other.x)
    }

    operator fun plusAssign(other: PlusAssign): Unit {
        println("Calling plusAssign")
        x += other.x
    }

    companion object {
        /**
         * Kotlin in Action, section 7.1.2
         * When you write += in your code, theoretically both plus and plusAssign functions
         * can be called (see figure 7.2). If this is the case, and both functions are defined
         * and applicable, the compiler reports an error. One possibility to resolve it is
         * replacing your use of the operator with a regular function call. Another is to replace
         * a var with a val, so that the plusAssign operation becomes inapplicable.
        */
        @JvmStatic
        fun main(args: Array<String>) {
            val y = PlusAssign(1)
            val z = PlusAssign(2)
            y += z  // this uses plusAssign not plus
            println(y)
        }
    }
}


