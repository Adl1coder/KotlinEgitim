package com.example.kotlinandroidprogramlamaodev.hafta1.odev1
fun main() {
    // Önceden belirlenen kullanıcı adı ve şifre
    val correctUsername = "adile"
    val correctPassword = "A2345"

    // Kullanıcıdan kullanıcı adı ve şifre girişi
    println("Kullanıcı Adı: ")
    val inputUsername = readLine()?.toLowerCase()

    println("Şifre: ")
    val inputPassword = readLine()

    // Eşleştirme
    if (inputUsername == correctUsername && inputPassword == correctPassword) {
        println("Hoş geldiniz!")
    } else {
        println("Kullanıcı adı veya şifre hatalı!")
    }
}