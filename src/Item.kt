class Item(val itemName: String, val itemPrice: Double, val itemQuantity: Int) {
    fun itemDesc() {
        val priceResult = calcPrice(itemPrice, itemQuantity)

        println("""
            Item: $itemName
            Price: RM$itemPrice
            Quantity: $itemQuantity
            Total: RM$priceResult
        """.trimIndent())
    }

    fun calcPrice(price: Double, itemQty: Int): Double {
        return price * itemQty
    }
}