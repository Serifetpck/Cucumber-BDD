Feature: : US008 OdevBRC

  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "brcUrl" anasayfasinda
    Then Login yazisina tiklar
    And "<gecersizEmail>" username girer
    And "<gecersizPass>" password girer
    And brc Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 3 saniye bekler

    Examples:
      | gecersizEmail | gecersizPass |
      | a@gmail.com   | gecersizPass |
      | b@gmail.com   | gecersizPass |
      | c@gmail.com   | gecersizPass |
      | d@gmail.com   | gecersizPass |

  Scenario: Kullanici sayfayi kapatir
    Given sayfayi kapatir