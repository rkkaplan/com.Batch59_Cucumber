Feature: US1003 kullanici parametre kullanarak arama yapabilmeli



  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon ana sayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Jova" icerdigini test eder
    Then sayfayi kapatir