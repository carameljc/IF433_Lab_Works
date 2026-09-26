package oop_105783_HannaPaulineHaryono.Week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    println("\n=== Testing MathHelper Overloading ===")
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    println("Luas persegi panjang (panjang=4, lebar=6): $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas lingkaran (jariJari=7.0): $luasLingkaran")

    println("\n=== Testing Sistem Pembayaran ===")
    val eWallet = EWallet(accountName = "Hanna", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Hanna", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)

        // Smart Casting Challenge: jika EWallet, top up otomatis lalu coba bayar lagi
        if (payment is EWallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
    }
}