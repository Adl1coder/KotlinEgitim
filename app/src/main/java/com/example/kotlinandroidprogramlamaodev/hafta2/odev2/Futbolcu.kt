package com.example.kotlinandroidprogramlamaodev.hafta2.odev2

class Futbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {
    fun kos() {
        println("$ad koşuyor.")
    }

    override fun oyna() {
        println("$ad futbol oynuyor.")
    }
}