#        When kullanici https://editor.datatables.net/ adresine gider
#        Then new butonuna basar
#        And tum bilgileri girer
#        And Create tusuna basar
#        When kullanici ilk isim ile arama yapar
#        Then isim bolumunde isminin oldugunu dogrular
Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  Scenario Outline: TC14 5 farkli kayit girisi yapabilmeli
    Given kullanici "datatablesUrl" ana sayfasinda
    Then new butonuna basar
    And firstname bolumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And lastname bolumune "<lastname>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And office bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu test eder

    Examples:
      | firstname | lastname | position | office | extension | startDate  | salary |
      | Alim      | Alim     | qa       | ankara | UI        | 2021-10-11 | 10000  |
      | Berk      | Can      | tester   | ankara | api       | 2022-02-01 | 10000  |
      | Huseyin   | Kacmaz   | BA       | Berlin | -         | 2021-01-01 | 10000  |
      | Fatih     | Sahin    | PO       | Berlin | -         | 2020-04-04 | 10000  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2021-10-10 | 10000  |



