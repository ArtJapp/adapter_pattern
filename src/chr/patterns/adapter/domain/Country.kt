package chr.patterns.adapter.domain

private const val UNDEFINED_COUNTRY = "Undefined Country"

val countries = mapOf(
    "UA" to "Ukraine",
    "RU" to "Russia",
    "CA" to "Canada"
)

fun getCountryByCode(code: String): String =
    countries.getOrDefault(code, UNDEFINED_COUNTRY)