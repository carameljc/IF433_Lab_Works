package oop_105783_HannaPaulineHaryono.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TUGAS 1: WEAPON ===")
    val w = Weapon("Excalibur")

    w.damage = -50  // Harus gagal & print peringatan (damage tetap 0)
    println("Damage saat ini: ${w.damage}")

    w.damage = 9999 // Harus dipaksa jadi 1000
    println("Weapon: ${w.name}, Damage: ${w.damage}, Tier: ${w.tier}")

    println("\n=== TUGAS 2: PLAYER ===")
    val player = Player("Knight99")

    // player.xp // Jika di-uncomment akan merah/error karena xp bersifat private

    player.addXp(50)
    println("Level saat ini: ${player.level}")

    player.addXp(60) // Total XP jadi 110, memicu pesan Level Up ke level 2
    println("Level saat ini: ${player.level}")
}