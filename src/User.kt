import CapitalizeHelper.capitalizeString

class User(val userName: String) {
    var item = Item()
    var username = userName.capitalizeString()

    fun showUser() {
        println("""
            User's Name: $username
            Item: ${item}
            Type: ${item.type}
        """.trimIndent())
    }
}