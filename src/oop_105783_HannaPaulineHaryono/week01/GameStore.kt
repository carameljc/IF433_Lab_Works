package oop_105783_HannaPaulineHaryono.week01

fun main() {
    val gameTitle: String = "Mario Kart"
    val price: Int = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.20).toInt()
} else {
    (price * 0.10).toInt()
}
fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
}