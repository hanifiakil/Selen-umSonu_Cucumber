Feature: US1004 kullanıcı parametre ile configration file i kullanabilir

  @config
  Scenario: TC07 configuration properties dosyasından parametre kullanımı

    Given kullanıcı "facebookUrl" anasayfasında
    Then kullanıcı 12 saniye bekler
    And url'in "facebook" içerdiğini test eder
    Then sayfayı kapatır