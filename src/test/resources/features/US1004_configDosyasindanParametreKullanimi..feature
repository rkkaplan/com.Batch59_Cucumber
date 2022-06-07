Feature: US1004 kullanici parametre ile Configuration file'i kullanabilmeli

  @config
  Scenario: TC07 configuration.properties dosyasindan parametre kullanimi
    Given kullanici "brcUrl" ana sayfasinda
    Then kullanici 6 sn bekler
    And url'in "blue" icerdigini test eder
    Then sayfayi kapatir