import CapitalizeHelper.capitalizeString

enum class ItemType {
    TROUSERS,
    SHIRTS,
    INNER,
    WATCH,
    COMPUTER,
    SMARTPHONE,
    NONE
}

class Item(val name: String = "", var quantity: Int = 0, val type: ItemType = ItemType.NONE) {
    override fun toString(): String {
        return "${name.capitalizeString()} - $quantity"
    }
}