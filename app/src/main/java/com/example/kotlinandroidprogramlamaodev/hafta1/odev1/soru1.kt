import java.util.Scanner

fun main() {
    // Önceden belirlenmiş kullanıcı adı ve şifre
    val predefinedUsername = "adile"
    val predefinedPassword = "Sifrebenim"

    // Kullanıcıdan girişleri almak için Scanner nesnesi oluşturuluyor
    println("Kullanıcı adınızı giriniz:")
    val scanner = Scanner(System.`in`)
    val enteredUsername = scanner.next()

    println("Şifrenizi giriniz:")
    val enteredPassword = scanner.next()

    // Kullanıcı adını ignoreCase=true ile karşılaştırıyoruz, böylece harf büyüklüğüne dikkat etmiyoruz
    // Ancak şifre için harf büyüklüğüne dikkat ediyoruz, bu nedenle ignoreCase=false kullanıyoruz
    if (enteredUsername.equals(predefinedUsername, ignoreCase = true) && enteredPassword == predefinedPassword) {
        println("Hoş geldiniz, $enteredUsername!")
    } else {
        println("Kullanıcı adı veya şifre hatalı!")
    }
}

