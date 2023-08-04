import java.util.*

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
    // Scanner kullanarak girdi alma işlemi için Scanner nesnesi oluşturuyoruz
  val scanner= Scanner(System.`in`)

    // Kullanıcıdan alınacak sayı adedini belirterek istem yapalım
  print("kaç sayı gireceksiniz")
    val arCount=scanner.nextInt()

    // Kullanıcıdan sayıları alıp diziye dönüştürelim
    print("Sayıları boşluklarla ayrılmış olarak girin: ")

   val ar= Array(arCount){
       scanner.nextInt()
   }

    // Kullanıcının girdiği sayıları ekrana yazdıralım
    println("Girilen sayılar:")
    for (num in ar) {
        println(num)
    }

    // simpleArraySum fonksiyonunu çağırıyoruz ve sonucu ekrana yazdırıyoruz
    val result = simpleArraySum(ar)
    println("Sayıların toplamı: $result")

    // Scanner nesnesini kapatmayı unutmayalım
    scanner.close()
}
