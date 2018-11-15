package callibrity

import kotlin.math.sqrt

class PrimeTester {

    fun isPrime(n: Int): Boolean {
        require(n >= 2) {
            "$n is invalid. Only 2 or greater allowed"
        }

        val upper = sqrt(n.toDouble()).toInt()
        for (d in 2..upper) {
            if (n % d == 0) return false
        }
        println("$n is prime")
        return true
    }


}
