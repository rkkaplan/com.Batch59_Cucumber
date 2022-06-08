# hotelmycamp sitesinde 3 adet negatif test senayosu olusturalim
# 1- Doğru username yanlis password
# 2- Yanlis username dogru password
# 3- Yanlis username yanlis password

Feature: US1006 yanlis bilgiler ile giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "HMCUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Scenario: TC10 yanlis username ile giris yapilamaz
      Given kullanici "HMCUrl" ana sayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And sayfayi kapatir

  Scenario: TC11 yanlis username ve yanlis sifre ile giris yapilamaz
    Given kullanici "HMCUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir