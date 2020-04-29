package playground

import playground.util.Benchmark

fun main() {
    println("Kotlin")

    (1..10).forEach { sumWithIntRange() }
    val bm = Benchmark()
    bm.start()
    var sum = 0
    (1..1000000).forEach { sum = sumWithIntRange() }
    bm.stop()
    println("sum = $sum")
    println("bm = ${bm}")

    sum = 0
    for (i in 1..1000) {
        if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) sum += i
    }
    println("sum = $sum")
}

private fun sumWithIntRange(): Int {
    var sum = (1..1000)
        .filter { i: Int -> i % 2 != 0 }
        .filter { i: Int -> i % 3 != 0 }
        .filter { i: Int -> i % 5 != 0 }
        .filter { i: Int -> i % 7 != 0 }
        .sum()
    return sum
}