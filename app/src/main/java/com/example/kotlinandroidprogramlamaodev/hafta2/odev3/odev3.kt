import com.example.kotlinandroidprogramlamaodev.hafta2.odev3.Personel

fun main() {
    val personel1 = Personel("eda", "ece", "doktor", 35000.0)
    val personel2 = Personel("ela", "boz", "sosyal medya", 30000.0)

    println("Personel 1: ${personel1.ad} ${personel1.soyad}, Pozisyon: ${personel1.pozisyon}, Maaş: ${personel1.maas}")
    println("Personel 2: ${personel2.ad} ${personel2.soyad}, Pozisyon: ${personel2.pozisyon}, Maaş: ${personel2.maas}")

    personel1.maasArttir(0.1) // Personel 1'in maaşını yüzde 10 arttır
    personel2.maasArttir(0.15) // Personel 2'nin maaşını yüzde 15 arttır

    println("Personel 1 (Güncel): ${personel1.ad} ${personel1.soyad}, Pozisyon: ${personel1.pozisyon}, Maaş: ${personel1.maas}")
    println("Personel 2 (Güncel): ${personel2.ad} ${personel2.soyad}, Pozisyon: ${personel2.pozisyon}, Maaş: ${personel2.maas}")
}
