import java.lang.IllegalArgumentException

fun Int.toRomanNumeral(): String {
    var result = ""
    var total = this

    while (total > 0) {
        val next = getLargestNumeral(total)
        if (next != null) {
            result += next.roman
            total -= next.number
        } else {
            total = 0
        }
    }

    if (result.isBlank()) {
        throw IllegalArgumentException("Could not translate $this to a number.")
    }

    return result
}

private fun getLargestNumeral(number: Int): Numeral? {
    return Numeral.values()
        .filter { it.number <= number }
        .maxByOrNull { it.number }
}