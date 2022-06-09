Feature: US1012 kullanici Register yapabilmeli
  @aut
  Scenario:TC17 Kullanici uygun datalarla Register olabilmeli


    Given kullanici "automationUrl" ana sayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin
    And sayfayi kapatir