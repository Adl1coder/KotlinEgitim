package com.example.kotlinandroidprogramlamaodev.hafta2.odev1





fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    println("Dikdörtgen Alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgen Çevresi: ${dikdortgen.cevreHesapla()}")

    val daire = Daire(4.0)
    println("Daire Alanı: ${daire.alanHesapla()}")
    println("Daire Çevresi: ${daire.cevreHesapla()}")
}
