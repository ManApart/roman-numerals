import java.lang.IllegalArgumentException

fun Int.toRomanNumeral(): String {
    var result = ""
    var total = this

    while (total > 0) {
        val next = getLargestNumeral(total)
        if (next != null) {
            if (isRepeatedNumeral(result, next)) {
                result = replaceRepeated(result, next)
            } else {
                result += next.roman
            }
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

private fun isRepeatedNumeral(result: String, next: Numeral): Boolean {
    val search = "${next.roman}${next.roman}${next.roman}"
    return result.endsWith(search)
}

fun replaceRepeated(result: String, next: Numeral): String {
    val highest = result.toCharArray().map { fromChar(it) }.maxByOrNull { it.number }!!
    return "${next.roman}${highest.getHigher().roman}"
}