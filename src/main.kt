fun main() {
    val user = User("john doe")
    val firstItem = Item("apple watch", 2, ItemType.WATCH)

    user.item = firstItem
//    firstItem.quantity = 2

    user.showUser()
}