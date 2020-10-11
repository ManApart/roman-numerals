import org.junit.Assert.assertEquals
import org.junit.Test

class RomanNumeralTest {

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

    @Test
    fun sumMultipleNumbers(){
        assertEquals(2, "II".romanToInt())
        assertEquals(6, "VI".romanToInt())
        assertEquals(40, "XXXX".romanToInt())
        assertEquals(60, "LX".romanToInt())
        assertEquals(200, "CC".romanToInt())
        assertEquals(600, "DC".romanToInt())
        assertEquals(1600, "MDC".romanToInt())
    }

    @Test
    fun sumMultipleNumbersAsNegatives(){
        assertEquals(4, "IV".romanToInt())
        assertEquals(9, "IX".romanToInt())
        assertEquals(40, "XL".romanToInt())
        assertEquals(90, "XC".romanToInt())
        assertEquals(400, "CD".romanToInt())
        assertEquals(900, "CM".romanToInt())
    }

}