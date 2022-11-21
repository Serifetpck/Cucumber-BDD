Feature: Parametre Kullanimi
  @bunu
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "facebook" icerdigini test edelim
    And sayfayi kapatir
  @gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "google" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "google" icerdigini test edelim
    And sayfayi kapatir
  @gp1
  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "brcUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "blue" icerdigini test edelim
    And sayfayi kapatir

  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir