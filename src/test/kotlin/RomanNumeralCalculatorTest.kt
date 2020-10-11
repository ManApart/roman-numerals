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

}