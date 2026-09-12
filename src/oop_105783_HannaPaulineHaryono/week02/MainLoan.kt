package oop_105783_HannaPaulineHaryono.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- SISTEM PEMINJAMAN BUKU ---")
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Lama pinjam tidak boleh minus! Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)
    val totalFine = loan.calculateFine()

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Lama Pinjam  : ${loan.loanDuration} hari")
    println("Total Denda  : Rp $totalFine")
}