package playground

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")

    companion object DefaultImpls_ {
        init {
            println("Me too!")
        }
    }
}


