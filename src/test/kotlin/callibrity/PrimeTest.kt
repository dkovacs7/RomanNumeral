package callibrity

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.junit.JUnitAsserter.fail

class PrimeTest {

    @Test
    fun t1() {
        val primeTester = PrimeTester()

        try {
            primeTester.isPrime(-1)
            fail("-1 should fail")
        } catch (e: IllegalArgumentException) {
            println("Success : $e")
        }

        try {
            primeTester.isPrime(0)
            fail("0 should fail")
        } catch (e: IllegalArgumentException) {
            println("Success : $e")
        }

        try {
            primeTester.isPrime(1)
            fail("1 should fail")
        } catch (e: IllegalArgumentException) {
            println("Success : $e")
        }

        assertTrue(primeTester.isPrime(2))
        assertTrue(primeTester.isPrime(3))
        assertFalse(primeTester.isPrime(4))
        assertTrue(primeTester.isPrime(5))
        assertFalse(primeTester.isPrime(6))
        assertTrue(primeTester.isPrime(7))
        assertFalse(primeTester.isPrime(8))
        assertFalse(primeTester.isPrime(9))
        assertFalse(primeTester.isPrime(10))
    }

    @Test
    fun t2() {
        println()

        val primeTester = PrimeTester()

        for (n in 2 .. 100) {
            primeTester.isPrime(n)
        }
    }

}