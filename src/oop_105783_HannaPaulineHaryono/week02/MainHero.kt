package oop_105783_HannaPaulineHaryono.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- MINI RPG BATTLE ---")
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val heroDamage = scanner.nextInt()

    val player = Hero(heroName, heroDamage)
    var enemyHp = 100
    val enemyName = "Dark Shadow"

    println("\nPertarungan dimulai melawan $enemyName!")

    while (player.isAlive() && enemyHp > 0) {
        println("\n--- Status Pertarungan ---")
        println("${player.name} HP : ${player.hp}")
        println("$enemyName HP   : $enemyHp")
        print("Pilih Aksi (1. Serang, 2. Kabur): ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            player.attack(enemyName)
            enemyHp -= player.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP $enemyName: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("$enemyName membalas dengan damage $enemyDamage!")
                player.takeDamage(enemyDamage)
                println("Sisa HP ${player.name}: ${player.hp}")
            }
        } else if (choice == 2) {
            println("${player.name} memutuskan untuk kabur dari medan perang!")
            break
        } else {
            println("Aksi tidak dikenal!")
        }
    }

    println("\n--- HASIL PERTARUNGAN ---")
    if (player.isAlive() && enemyHp <= 0) {
        println("Selamat! ${player.name} berhasil mengalahkan $enemyName!")
    } else if (!player.isAlive()) {
        println("${player.name} telah gugur dalam pertempuran...")
    } else {
        println("Pertarungan berakhir karena kamu kabur.")
    }
}