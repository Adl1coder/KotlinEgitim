package com.example.kotlinandroidprogramlamaodev.hafta2.odev4
//hackerrank sorusu
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
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum = 0 // Toplamı tutmak için bir değişken oluşturuyoruz ve başlangıç değerini 0 yapıyoruz.
    for (element in ar) {
        sum += element // Her elemanı toplam değişkenine ekliyoruz.
    }
    return sum // Toplamı döndürüyoruz.
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt() // Kullanıcıdan dizinin boyutunu alıyoruz.

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray() // Kullanıcıdan dizinin elemanlarını alıyoruz.

    val result = simpleArraySum(ar) // simpleArraySum fonksiyonunu çağırarak toplamı hesaplatıyoruz.

    println(result) // Sonucu ekrana yazdırıyoruz.
}

