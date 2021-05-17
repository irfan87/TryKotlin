fun main() {
    val item = "watch"
    val price = 12.10
    val quantity = 2

    val watch = Item(item, price.toDouble(), quantity)
    val shirt = Item("t-shirt", 31.00, 3)
    val pants = Item("pants", 25.20, 5)
    val boxers = Item("boxers", 20.00, 10)

    println("Item Description")
    println()
    watch.itemDesc()
    println()
    shirt.itemDesc()
    println()
    pants.itemDesc()
    println()
    boxers.itemDesc()
}