package com.example.kotlinandroidprogramlamaodev.hafta2.odev2


fun main() {
    val futbolcu = Futbolcu("Meral", 24, "BJK")
    futbolcu.kos()
    futbolcu.oyna()
    println("Meral ${futbolcu.takim} ile devam edecek!")

    val basketbolcu = Basketbolcu("Ali", 25, "GS")
    basketbolcu.smac()
    println("Ali ${basketbolcu.takim} takımında!")
    basketbolcu.oyna()
}
