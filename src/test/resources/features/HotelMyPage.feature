Feature: HotelMyCamp
  Scenario: TC01 kullanici HotelMyCamp Sayfasina giris yapmasi
  Given kullanici hotelmycamp adresine gider
  Then kullanici login butonuna basar
  Then kullanici test data username: manager olarak girer
  When kullanici test data password : Manager1! Degerleri girildiginde
  And kullanici sayfaya basarili sekilde girilebildigini test eder.
    And kullanici sayfayi kapatir