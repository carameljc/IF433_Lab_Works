package oop_105783_HannaPaulineHaryono.week01

fun main() {
    val gameTitle: String = "Mario Kart"
    val price: Int = 600000

    val discount = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.20).toInt()
} else {
    (price * 0.10).toInt()
}