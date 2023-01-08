fun main(args: Array<String>) {
    val customers = arrayListOf<Customer>()
    customers.add(Customer("J", "j@j.c", 7))
    customers.add(Customer("L", "l@j.c", 3))
    customers.add(Customer("M", "m@j.c", 8))

    println(customers)

    val newCustomer: Customer = customers[1].copy(email = "ll@j.c")
    customers.add(newCustomer)

    println(customers)
    sendEmail(customers)
}

fun sendEmail(customers: ArrayList<Customer>) {
    customers.forEach {
        println("Sending email to ${it.email}")
    }
}