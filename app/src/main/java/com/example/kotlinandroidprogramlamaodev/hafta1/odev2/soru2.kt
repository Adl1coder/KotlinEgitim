package com.example.kotlinandroidprogramlamaodev.hafta1.odev2
fun main() {
    // Kullanıcıdan yaş alma
    println("Yaşınızı giriniz: ")
    val inputAge = readLine()

    try {
        // Girilen yaşı tamsayıya dönüştürme
        val age = inputAge?.toInt()

        // Yaşı kontrolü ve mesaj
        if (age != null) {
            if (age >= 18) {
                println("Oy kullanabilirsiniz!")
            } else {
                println("Oy kullanamazsınız.")
            }
        } else {
            println("Geçerli bir yaş girmediniz.")
        }
    } catch (e: NumberFormatException) {
        println("Geçerli bir sayı giriniz.")
    }
}