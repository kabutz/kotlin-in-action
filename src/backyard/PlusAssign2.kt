package backyard

class PlusAssign2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var readOnly = listOf(1, 2, 3)
            val mutable = mutableListOf(1, 2, 3)

            println("readOnly = ${readOnly}")
            println("mutable = ${mutable}")
            println("readOnly ID = ${System.identityHashCode(readOnly)}")
            println("mutable ID = ${System.identityHashCode(mutable)}")
            println()

            // returns a new list; uses plus()
            // compile error if using 'val' for the variable declaration
            readOnly += 4

            // amends the mutable list; uses plusAssign()
            // compile error if using 'var' for the variable declaration
            mutable += 4

            println("readOnly = ${readOnly}")
            println("mutable = ${mutable}")
            println("readOnly ID = ${System.identityHashCode(readOnly)}")
            println("mutable ID = ${System.identityHashCode(mutable)}")
        }
    }
}


