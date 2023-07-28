import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'simpleArraySum' function below.
 *
 * Fonksiyonun amacı, parametre olarak aldığı tamsayı dizisinin elemanlarının toplamını DÖNMEKTİR.
 */

fun simpleArraySum(ar: Array<Int>): Int {
    // Elemanların toplamını saklamak için bir değişkeni başlangıç değeriyle oluşturuyoruz
    var totalSum = 0

    // Dizi içindeki her bir elemanı döngü ile toplam değişkenine ekliyoruz
    for (num in ar) {
        totalSum += num
    }

    // Toplamı tamsayı olarak geri döndürüyoruz
    return totalSum
}

fun main(args: Array<String>) {
    // Kullanıcıdan alınacak sayı adedini belirterek istem yapalım
    print("Kaç adet sayı gireceksiniz? ")
    val arCount = readLine()!!.trim().toInt()

    // Kullanıcıdan sayıları alıp diziye dönüştürelim
    print("Sayıları boşluklarla ayrılmış olarak girin: ")
    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    // Kullanıcının girdiği sayıları ekrana yazdıralım
    println("Girilen sayılar:")
    for (num in ar) {
        println(num)
    }

    // simpleArraySum fonksiyonunu çağırıyoruz ve sonucu ekrana yazdırıyoruz
    val result = simpleArraySum(ar)
    println("Sayıların toplamı: $result")
    //
}
