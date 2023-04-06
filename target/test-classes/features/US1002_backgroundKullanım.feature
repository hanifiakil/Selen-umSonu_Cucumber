
@hanifi @pr1
Feature: us1002 Kullanıcı ortak adımları Background ile çalıştırır
  Background: ortak adım
    Given kullanıcı amazon anasayfasında

  Scenario: TC04 amazon nutella arama
    And kullanıcı Nutella için arama yapar
    Then sonuçların Nutella içerdiğini test eder
    And sayfayı kapatır

    Scenario: TC05 amazon java arama
      And kullanıcı Java için arama yapar
      Then sonuçların Java içerdiğini test eder
      And sayfayı kapatır