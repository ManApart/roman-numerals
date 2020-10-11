import org.junit.Assert.assertEquals
import org.junit.Test
import java.lang.IllegalArgumentException

class ToRomanTest {

    @Test
    fun toRomanNumeralTest(){
        assertEquals("I", 1.toRomanNumeral())
        assertEquals("V", 5.toRomanNumeral())
        assertEquals("X", 10.toRomanNumeral())
        assertEquals("L", 50.toRomanNumeral())
        assertEquals("C", 100.toRomanNumeral())
        assertEquals("D", 500.toRomanNumeral())
        assertEquals("M", 1000.toRomanNumeral())
    }

    @Test(expected = IllegalArgumentException::class)
    fun nonRomanNumeralThrowsError() {
        (-1).toRomanNumeral()
    }

//    @Test
//    fun sumMultipleNumbersToRoman(){
//        assertEquals("II", 2.toRomanNumeral())
//        assertEquals("VI", 6.toRomanNumeral())
//        assertEquals("XXX", 30.toRomanNumeral())
//        assertEquals("LX", 60.toRomanNumeral())
//        assertEquals("CC", 200.toRomanNumeral())
//        assertEquals("DC", 600.toRomanNumeral())
//        assertEquals("MDC", 1600.toRomanNumeral())
//    }


}