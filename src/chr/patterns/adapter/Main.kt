package chr.patterns.adapter

import chr.patterns.adapter.adapter.IncomeDataAdapter
import chr.patterns.adapter.domain.Contact
import chr.patterns.adapter.domain.Customer

fun main() {
    IncomeDataAdapter(MockIncomeData()).let {

        val contact = it as Contact
        println(contact.getName())
        println(contact.getPhoneNumber())

        val customer = it as Customer
        println(customer.getCompanyName())
        println(customer.getCountryName())
    }

}