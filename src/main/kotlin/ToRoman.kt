fun Int.toRomanNumeral(): String {
    return when (this) {
        1 -> "I"
        5 -> "V"
        10 -> "X"
        50 -> "L"
        100 -> "C"
        500 -> "D"
        else -> "M"
    }
}

//private fun