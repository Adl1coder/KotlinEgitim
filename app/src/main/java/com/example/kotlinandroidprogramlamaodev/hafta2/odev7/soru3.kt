package com.example.kotlinandroidprogramlamaodev.hafta2.odev7
// 1. Bu işlev tanımı, bir sayıyı 1 artırarak geri dönen basit bir artırma işlevini göstermektedir.
fun increaseDirty(start: Int): Int {
    return start + 1
}
//cevap: updateDirty(15, ::increaseDirty)


// 2. Bu işlev, "dirty" adında bir tamsayıyı ve bir işlevi parametre olarak alır.
//    Bu işlev, verilen "dirty" değerini alınan işlevi kullanarak günceller ve sonucu yazdırır.
fun updateDirty(dirty: Int, operation: (Int) -> Int) {
    val result = operation(dirty)
    println("Updated dirty value: $result")
}
fun main() {
// 3. İşlevleri ve işlevleri nasıl kullanacağımızı gösterecek örnek bir kod parçası:

// Birinci adım: increaseDirty işlevini kullanarak artırma işlevini tanımlarız.
    val increaseFunction = ::increaseDirty

// İkinci adım: updateDirty işlevini kullanarak artırma işlevini çağırırız.
// Bu, "15" sayısını artırma işlevine geçirecek ve sonucu yazdıracaktır.
    updateDirty(15, increaseFunction)
}
//
