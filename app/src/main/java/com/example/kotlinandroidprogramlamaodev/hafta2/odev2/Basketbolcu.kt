package com.example.kotlinandroidprogramlamaodev.hafta2.odev2

class Basketbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {
    fun smac() {
        println("$ad smaç yapıyor.")
    }

    override fun oyna() {
        println("$ad basketbol oynuyor.")
    }
}