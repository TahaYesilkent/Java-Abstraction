# Proje Adı: OOP Temelleri Uygulamaları (Mağaza ve RPG)

Bu depo, Java'da Nesne Yönelimli Programlama (OOP) temel kavramlarını (Kalıtım, Polimorfizm, Soyutlama ve Arayüzler) uygulamalı olarak göstermek amacıyla oluşturulmuştur. Proje, iki bağımsız modül içerir:

1.  **Mağaza Sistemi:** Ürünlerin soyut sınıflar ve kalıtım yoluyla yönetilmesi.
2.  **Basit RPG Sistemi:** Canavarların arayüzler ve kalıtım yoluyla davranışlarının (kanama, zehirleme) modellenmesi.

---

## Ön Koşullar

* Java Development Kit (JDK) 11 veya üzeri
* Maven veya Gradle (tercihen)
* JUnit 5 (Testler için)

---

## Modül 1: Mağaza Sistemi (org.example.model)

Bu modül, bir mağazada satılan ürünlerin modellenmesini amaçlar ve **Kalıtım (Inheritance)** ile **Soyutlama (Abstraction)** prensiplerini kullanır.

### Sınıf Yapısı ve OOP Prensibi

| Sınıf / Metot | Tipi | Açıklama | OOP Prensibi |
| :--- | :--- | :--- | :--- |
| `ProductForSale` | Abstract Sınıf | Tüm ürünlerin ortak özelliklerini (`type`, `price`, `description`) ve metotlarını (`getSalesPrice`, `showDetails`) tanımlar. Metotlar, testlere uygun olarak `public` erişime sahiptir. | Soyutlama |
| `Chocolate` | Sınıf | `ProductForSale`'dan türetilmiştir. Ek olarak `sort` (çeşit) özelliğine sahiptir. | Kalıtım |
| `Coke` | Sınıf | `ProductForSale`'dan türetilmiştir. Ek olarak `containSugar` (şeker içeriği) özelliğine sahiptir. | Kalıtım |
| `Bread` | Sınıf | `ProductForSale`'dan türetilmiştir. Ek olarak `piece` (adet) özelliğine sahiptir. | Kalıtım |
| `Store` | Sınıf | Uygulama giriş noktasıdır. Ürünleri bir diziye alır ve Polimorfizm kullanarak tüm ürünlerin kendine özgü detaylarını (`showDetails`) listeler. | Polimorfizm |

---

## Modül 2: Basit RPG Sistemi (org.example.rpg)

Bu modül, bir RPG oyunundaki canavarların temel davranışlarını tanımlar ve **Arayüzler (Interfaces)** ile **Polimorfizm** prensiplerini kullanır.

### Sınıf Yapısı ve OOP Prensibi

| Sınıf / Metot | Tipi | Açıklama | OOP Prensibi |
| :--- | :--- | :--- | :--- |
| `Bleedable` | Arayüz (Interface) | Kanama yeteneği olan yaratıklar için `bleed()` metodunu tanımlar. | Arayüz |
| `Poisonable` | Arayüz (Interface) | Zehirleme yeteneği olan yaratıklar için `poison()` metodunu tanımlar. | Arayüz |
| `Monster` | Sınıf | Tüm canavarların temel özelliklerini (`name`, `hitPoints`, `damage`) sağlar. Constructor sırası testlere uygun olarak ayarlanmıştır. | Kalıtım & Arayüz |
| `Troll` | Sınıf | `Monster`'dan türetilmiştir ve her iki arayüzü de implemente eder. `criticalChance` değişkenine bağlı olarak ek hasar hesaplar. | Polimorfizm |

---

## Testler

Proje, temel işlevselliği doğrulamak için bir JUnit 5 test sınıfı (`MainTest.java`) içermektedir. Testler, özellikle constructor argüman sıralaması, erişim belirteçleri ve hesaplama mantığının doğruluğunu garanti altına alır.

---

## Lisans

Bu proje lisanslanmamıştır. Eğitim ve kişisel kullanım amaçlıdır.
