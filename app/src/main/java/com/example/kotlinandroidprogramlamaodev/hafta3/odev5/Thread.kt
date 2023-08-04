import kotlin.concurrent.thread
import java.util.concurrent.CountDownLatch

fun main() {

    val latch = CountDownLatch(2)


    thread {
        println("Thread 1 başlıyor...")
        Thread.sleep(5000) // 5 saniye uyku
        println("Thread 1 çalışmayı bitirdi.")
        latch.countDown() // İşlem tamamlandığında latch değerini azalt
    }


    thread {
        println("Thread 2 başlıyor...")
        Thread.sleep(3000) // 3 saniye uyku
        println("Thread 2 çalışmayı bitirdi.")
        latch.countDown() // İşlem tamamlandığında latch değerini azalt
    }

    // Ana thread 6 saniye uyusun
    println("Ana thread 6 saniye uyuyor...")
    Thread.sleep(6000)

    // Diğer threadlerin bitmesini bekle
    latch.await()

    println("Tüm threadlerin çalışması tamamlandı.")
}
