package com.example.kotlinandroidprogramlamaodev.hafta2.odev5



fun main() {
    val kullanici1 = Kullanici("ece", "üner")
    val kullanici2 = Kullanici("mehmet", null)
    val kullanici3 = Kullanici(null, "Kaya")

    // Nullable özelliklere erişim için ? işaretini kullanırız.
    println("Kullanıcı 1: Ad: ${kullanici1.ad}, Soyad: ${kullanici1.soyad}")
    println("Kullanıcı 2: Ad: ${kullanici2.ad}, Soyad: ${kullanici2.soyad}")
    println("Kullanıcı 3: Ad: ${kullanici3.ad}, Soyad: ${kullanici3.soyad}")

    // Örnek olarak, nullable özelliğin değeri boş (null) olabilir:
    val kullanici4 = Kullanici(null, null)
    println("Kullanıcı 4: Ad: ${kullanici4.ad}, Soyad: ${kullanici4.soyad}")
}
