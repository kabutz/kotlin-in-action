package ch07

class ShiftLeftK {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            val start: Int = 0x8000_0001  // Error: Thinks it's a Long ??
            val start = -0x7FFF_FFFF
            for (shift in 0..31) {
                val shifted = start shl shift
                System.out.printf(
                    "%d\t%11d\t%32s\t%8s%n",
                    shift,
                    shifted,
                    Integer.toBinaryString(shifted).padStart(32, '_'),
                    Integer.toHexString(shifted).padStart(8, '_')
                )
            }
        }
    }
}