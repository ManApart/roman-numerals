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

    @Test
    fun romanToIntTest(){
        assertEquals(1, "I".romanToInt())
        assertEquals(5, "V".romanToInt())
        assertEquals(10, "X".romanToInt())
        assertEquals(50, "L".romanToInt())
        assertEquals(100, "C".romanToInt())
        assertEquals(500, "D".romanToInt())
        assertEquals(1000, "M".romanToInt())
    }

}