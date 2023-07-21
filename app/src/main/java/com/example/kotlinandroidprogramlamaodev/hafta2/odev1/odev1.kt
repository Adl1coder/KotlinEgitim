package com.example.kotlinandroidprogramlamaodev.hafta2.odev1

open class GeometrikSekil {
    open fun alanHesapla(): Double {
        return 0.0
    }

    open fun cevreHesapla(): Double {
        return 0.0
    }
}

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    println("Dikdörtgen Alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgen Çevresi: ${dikdortgen.cevreHesapla()}")

    val daire = Daire(4.0)
    println("Daire Alanı: ${daire.alanHesapla()}")
    println("Daire Çevresi: ${daire.cevreHesapla()}")
}
