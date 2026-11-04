package oop_105783_HannaPaulineHaryono.Week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name (ID: $id)"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        // Ekstrak ID dengan when (exhaustive karena sealed class)
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        // Kita yakin Java service selalu berhasil, jadi pakai !! (Java Interop)
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Pembayaran sukses. Transaction ID: $transactionId")
    }
}