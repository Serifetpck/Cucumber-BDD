Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "dataUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanici 1 saniye bekler
    And soyisim bolumune "<lastName>" yazar
    And kullanici 1 saniye bekler
    And position bolumune "<position>" yazar
    And kullanici 1 saniye bekler
    And ofis bolumune "<office>" yazar
    And kullanici 1 saniye bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 saniye bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 saniye bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 saniye bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu test eder

    Examples:
      | firstname | lastName | position | office   | extension | startDate  | salary |
      | erol      | evren    | qa       | burdur   | UI        | 2021-10-11 | 20000  |
      | emre      | Can      | tester   | izmir    | api       | 2022-05-05 | 11000  |
      | ahmet     | Kacmaz   | BA       | istanbul | -         | 2022-07-10 | 40000  |
      | cemil     | efe      | PO       | ankara   | -         | 2022-03-12 | 45000  |
      | selim     | Kaya     | Tester   | ankara   | database  | 2022-06-06 | 11000  |

  Scenario: Kullanıcı Sayfayı Kapatır
    Given sayfayi kapatir