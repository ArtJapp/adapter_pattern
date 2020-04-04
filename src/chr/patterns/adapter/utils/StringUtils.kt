package chr.patterns.adapter.utils

fun String.safeRepeat(n: Int): String {
    return this.takeIf { n < 0 } ?: repeat(n)
}

fun String.formatPhone(): String {
    return "(" + substring(0, 3) + ")" + substring(3, 6) + "-" + substring(6, 8) + "-" + substring(8)
}