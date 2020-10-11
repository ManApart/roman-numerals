import org.junit.Assert.assertEquals
import org.junit.Test

class RomanNumeralCalculatorTest {

    @Test
    fun additionTest(){
        assertEquals("II", "I".addRoman("I"))
        assertEquals("III", "II".addRoman("I"))
        assertEquals("IV", "III".addRoman("I"))
        assertEquals("M", "D".addRoman("D"))
    }

    @Test
    fun subtractionTest(){
        assertEquals("I", "II".subtractRoman("I"))
        assertEquals("II", "III".subtractRoman("I"))
        assertEquals("IV", "V".subtractRoman("I"))
        assertEquals("D", "M".subtractRoman("D"))
    }

}