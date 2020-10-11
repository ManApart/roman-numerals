fun main(){
    println("Hello World")
}


fun Int.toRomanNumeral() : String {
    return when (this){
        1 -> "I"
        5 -> "V"
        10 -> "X"
        50 -> "L"
        100 -> "C"
        500 -> "D"
        else -> "M"
    }
}

fun String.romanToInt() : Int {
    return this.toCharArray().sumBy { it.romanToInt() }
}

fun Char.romanToInt() : Int {
    return when (this){
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        else -> 1000
    }
}