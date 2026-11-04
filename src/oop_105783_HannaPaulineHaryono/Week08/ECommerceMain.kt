package oop_105783_HannaPaulineHaryono.Week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    println("=== E-COMMERCE PIPELINE ===")
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                println("Berhasil parse: $it")
                parser.checkout(it)
            } ?: println("Skip: tipe produk '${raw["type"]}' tidak dikenali.")
        } catch (e: IllegalArgumentException) {
            println("PERINGATAN: data korup terdeteksi -> ${e.message}")
        }
        println("--------------------------")
    }
}