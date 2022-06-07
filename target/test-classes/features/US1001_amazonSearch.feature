@wip
Feature: US1001 Amazon Search

  @nutella
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon ana sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And  sayfayi kapatir
  @java
  Scenario: TC02 kullanici amazonda Java aratir
    Given kullanici amazon ana sayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder

    And sayfayi kapatir
  @iphone
  Scenario: TC03 kullanici amazonda iphone aratir
    When kullanici amazon ana sayfasinda
    And kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir