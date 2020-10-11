fun String.addRoman(other: String): String {
    val total = this.romanToInt() + other.romanToInt()
    return total.toRomanNumeral()
}

fun String.subtractRoman(other: String): String {
    return ""
}