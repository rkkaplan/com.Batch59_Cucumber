#http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
#Cucumber framework’de US1012_Guru_Web_Tables altinda
#            Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli   olusturun ve                asagidaki testi yapin
#        Given user web sayfasinda
#        And “Istenen Baslik”, sutunundaki tum degerleri yazdirir

  Feature: US1011  web tablosundaki istenen sutunu yazdirma
    @guru
    Scenario: TC16 kullanici sutun basligi ile liste alabilmeli
      Given kullanici "guruUrl" ana sayfasinda
      And kullanici 3 sn bekler
      And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
      Then sayfayi kapatir

