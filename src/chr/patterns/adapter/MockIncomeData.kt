package chr.patterns.adapter

import chr.patterns.adapter.domain.IncomeData

/**
 * Моковые данные для демонстрации работы адаптера
 */
class MockIncomeData: IncomeData {

    override fun getCountryCode(): String = "UA"

    override fun getCompany(): String = "NotJavaRush Ltd."

    override fun getContactFirstName(): String = "Ivan"

    override fun getContactLastName(): String = "Ivanov"

    override fun getCountryPhoneCode(): Int = 38

    override fun getPhoneNumber(): Int = 501234567
}