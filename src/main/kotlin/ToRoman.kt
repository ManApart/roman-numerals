import java.lang.IllegalArgumentException

fun Int.toRomanNumeral(): String {
    val converted = Numeral.values().firstOrNull { it.number == this }?.roman ?: throw IllegalArgumentException("Could not translate $this to a number.")
    return converted.toString()
}

private fun getLargestNumeral() {

}