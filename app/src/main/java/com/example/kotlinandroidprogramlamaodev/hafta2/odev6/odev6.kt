package com.example.kotlinandroidprogramlamaodev.hafta2.odev6
/*
Null-safety, Kotlin dilinin diğer programlama dillerine kıyasla bazı avantajlarına sahiptir:

1. Daha Güvenli Kodlama:
 Null-safety, NullPointerException gibi sık rastlanan hataların önüne geçerek daha güvenli bir kodlama ortamı sunar.
 Bu sayede programcılar, null referanslardan kaynaklanan hataları daha kolay tespit eder ve düzeltir.

2. Daha Az Sorunlu Hata Ayıklama:
Null referanslarından kaynaklanan hatalar, yazılımın çalıştığı sırada ortaya çıkar
ve çoğu zaman uygulamanın beklenmedik bir şekilde çökmesine neden olabilir.
Kotlin'in null-safety özelliği, bu tür hataları önlemeye yardımcı olur ve daha az sorunlu hata ayıklama süreci sağlar.

3. Daha Az Uzun ve Karmaşık Kod:
Diğer dillerde, null referanslardan kaynaklanan hataların önüne geçmek için ekstra kontrol ifadeleri ve null check'ler eklemek gerekebilir.
Kotlin'in null-safety özelliği sayesinde bu tür kontrol ifadelerine ihtiyaç duyulmadığından kodlar daha kısa ve daha az karmaşık hale gelir.

4. Null Referanslı Veri Kullanımı:
Kotlin'de, nullable özellikler ve nullable türler kullanarak, veri kaynaklarından null değerlerle başa çıkma imkanı sunulur.
Özellikle veritabanı gibi kaynaklardan gelen verilerde null değerler yaygındır. Null-safety, bu tür verilerin güvenli bir şekilde işlenmesini sağlar.

Neden Kotlin'in null-safety özelliği diğer dillerden farklıdır?

Kotlin, diğer birçok programlama dilinden farklı olarak null-safety'i dil seviyesinde bir özellik olarak destekler.
Bu, dilin tasarımından itibaren null güvenliğini sağlamak için özel olarak düşünüldüğü anlamına gelir.
Bu sayede programcılar, nullable ve non-nullable türler arasında açık bir ayrım yapabilirler.

Diğer bazı dillerde, null referanslarla ilgili kontrolleri yapısal olarak yapmak zorunda kalabilirsiniz
ve bu kontroller programcı tarafından manuel olarak yapılmalıdır.
Bu tür dillerde null güvenliğinin sağlanması için bazı tasarım desenleri ve kodlama standartları kullanılabilir.
 Ancak Kotlin'de null-safety dil seviyesinde sağlandığından, bu tür ekstra kontroller ve desenler gerekmez.
  Programcılar, nullable ve non-nullable türler arasındaki dönüşümleri açık bir şekilde belirtirler
  ve Kotlin derleyicisi tarafından güvenlik denetimleri otomatik olarak yapılır. Bu da kodun daha güvenli ve hatasız olmasını sağlar.
*/

