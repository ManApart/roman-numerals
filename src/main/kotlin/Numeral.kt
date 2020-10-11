import java.lang.IllegalArgumentException

enum class Numeral(val roman: Char, val number: Int) {
    I('I', 1),
    V('V', 5),
    X('X', 10),
    L('L', 50),
    C('C', 100),
    D('D', 500),
    M('M', 1000);

    fun getHigher(): Numeral {
        val i = sorted.indexOf(this)
        return if (i == sorted.size - 1) {
            sorted.last()
        } else {
            sorted[i + 1]
        }
    }
}

private val sorted = Numeral.values().sortedBy { it.number }

fun fromChar(char: Char): Numeral {
    return Numeral.values().firstOrNull { char == it.roman }
        ?: throw IllegalArgumentException("$char is not a roman numeral")
}