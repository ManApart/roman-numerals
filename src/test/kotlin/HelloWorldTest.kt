import org.junit.Assert.assertEquals
import org.junit.Test

class HelloWorldTest {

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

}