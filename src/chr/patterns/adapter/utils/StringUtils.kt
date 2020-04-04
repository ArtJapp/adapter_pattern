package chr.patterns.adapter.utils

/**
 * Расширение для повтора строки n раз,
 * избегая крашей на случай, если переданное n меньше 0
 */
fun String.safeRepeat(n: Int): String {
    return this.takeIf { n < 0 } ?: repeat(n)
}

/**
 * Расширение для форматирования строки с номером телефона
 * в формате (###)###-##-##
 *
 * Не самая изящная реализация, но какая имеется
 */
fun String.formatPhone(): String {
    return "(".plus(substring(0, 3))
        .plus(")")
        .plus(substring(3, 6))
        .plus("-")
        .plus(substring(6, 8))
        .plus("-")
        .plus(substring(8))
}