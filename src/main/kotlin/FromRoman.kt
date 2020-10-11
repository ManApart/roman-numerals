fun String.romanToInt(): Int {
    val chars = this.toCharArray()
    var total = 0
    var i = 0
    while (i < chars.size) {
        val nextIsGreater = isNextGreater(chars, i)
        if (nextIsGreater){
            total += (this[i+1].romanToInt() - this[i].romanToInt())
            i += 2
        } else {
            total += this[i].romanToInt()
            i++
        }
    }

    return total
}

private fun isNextGreater(chars: CharArray, i: Int): Boolean {
    return chars.size > i + 1 && chars[i + 1].romanToInt() > chars[i].romanToInt()
}

fun Char.romanToInt(): Int {
    return when (this) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        else -> 1000
    }
}