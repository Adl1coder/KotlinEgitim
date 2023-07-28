package com.example.kotlinandroidprogramlamaodev.hafta2.odev1

import kotlin.math.PI

class Daire(val yaricap: Double) : GeometrikSekil() {
    override fun alanHesapla(): Double {
        return PI * yaricap * yaricap
    }

    override fun cevreHesapla(): Double {
        return 2 * PI * yaricap
    }
}