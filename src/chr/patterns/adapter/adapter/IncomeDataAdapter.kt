package chr.patterns.adapter.adapter

import chr.patterns.adapter.domain.Contact
import chr.patterns.adapter.domain.Customer
import chr.patterns.adapter.domain.IncomeData
import chr.patterns.adapter.domain.getCountryByCode
import chr.patterns.adapter.utils.formatPhone
import chr.patterns.adapter.utils.safeRepeat

private const val NORMAL_PHONE_LENGTH = 10
private const val NAME_DELIMITER = ", "

class IncomeDataAdapter(
    private val incomeData: IncomeData
) : Contact, Customer {

    override fun getName(): String {
        return incomeData.getContactLastName()
            .plus(NAME_DELIMITER)
            .plus(incomeData.getContactFirstName())
    }

    override fun getPhoneNumber(): String {
        return incomeData.getPhoneNumber()
            .toString()
            // нормализация номера путем дописывания нулей
            .let { "0".safeRepeat(NORMAL_PHONE_LENGTH - it.length).plus(it) }
            // форматирование номера
            .let { "+".plus(incomeData.getCountryPhoneCode()).plus(it.formatPhone()) }
    }

    override fun getCompanyName(): String {
        return incomeData.getCompany()
    }

    override fun getCountryName(): String {
        return getCountryByCode(incomeData.getCountryCode())
    }
}