package com.example.kotlinandroidprogramlamaodev.hafta2.odev7


fun main(){


    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println(decorations.filter {it.contains('p')})
}
//cevap:[pagoda, plastic plant, flowerpot]