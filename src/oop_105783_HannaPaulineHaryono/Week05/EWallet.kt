package oop_105783_HannaPaulineHaryono.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran sebesar $amount berhasil menggunakan EWallet. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo tidak cukup untuk membayar $amount. Saldo saat ini: $balance")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sebesar $amount berhasil. Saldo sekarang: $balance")
    }
}