package com.example.kotlinandroidprogramlamaodev.hafta2.odev3

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    fun maasArttir(oran: Double) {
        maas *= (1 + oran)
    }
}