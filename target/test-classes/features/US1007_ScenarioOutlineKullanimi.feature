#amazon sayfasina gidip sirasiyla nutella, java, elma,armut aratip
# sonuclarin arama yaptigiz kelimeyi icerdigini test edelim

  Feature: US1007 kullanici amazon'da istedigi kelimeyi aratir
    @rk
    Scenario Outline: TC12 amazon'da listedeki elementleri aratma
      Given kullanici "amazonUrl" ana sayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|
      |nutella      |
      |java         |
      |elma         |
      |armut        |