fun main(args: Array<String>) {
    val myUser1 = User("Jalal", "jalal@majzoub.com", "JM")
    val myUser2 = User("Jalal", "jalal@majzoub.com", "JM")
    val myUser3 = User1("Jalal", "jalal@majzoub.com", "JM")
    val myUser4 = User1("Jalal", "jalal@majzoub.com", "JM")

    // Difference in comparing between normal class and data class

    println(myUser2 == myUser1) // Compares data true
    println(myUser4 == myUser3) // Compares references myUser3 & myUser4 (2 different names of objects) false

    // toString()

    println(myUser1.toString()) // println the data => User(name=Jalal, email=jalal@majzoub.com, password=JM)
    println(myUser3.toString()) // println the object reference => User1@19dfb72a

    // . copy() with data class

    val myUser5 = myUser1.copy(email="jrm@jrm.com") // copy all info and change the email
    println(myUser5)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)

 class User1(
     val name: String,
     val email: String,
     val password: String
 )