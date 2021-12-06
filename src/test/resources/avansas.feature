@avansas
Feature:https://avansas.com/ adresini ziyaret edin ve  Avansas ana sayfasının açılıp açılmadığını kontrol eder


  Background:
    Given kullanici "https://avansas.com/" adresini ziyaret edip Avansas ana sayfasinin acilip acilmadigini kontrol eder

  @TC-001
  Scenario:
    Given Avansas.com da arama alanina "kalem" yazilarak ara butonu tiklanir.
    And Kategori listesinde kursun kalemler listesi secilir.
    And Siralama fonksiyonundan ada gore sirala secilir.
    And Gelen urun listesinden adinda "Bic Evolution" iceren kac urun oldugu tespit edilir.urun adedi  0 dan fazla ise test basarilidir.Urun adedi 0 ise test basarisizdir.


