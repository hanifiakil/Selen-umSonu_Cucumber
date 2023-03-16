Feature: Amazon Search

  Scenario: TC01 kullanıcı amazonda Nutella aratır

    Given kullanıcı amazon anasayfasında
    Then kullanıcı Nutella için arama yapar
    And sonuçların Nutella içerdiğini test eder
    And sayfayı kapatır

  Scenario: TC02 kullanıcı amazonda Java aratır
    Given kullanıcı amazon anasayfasında
    Then kullanıcı Java için arama yapar
    And sonuçların Java içerdiğini test eder
    And sayfayı kapatır

  Scenario: TC03 kullanıcı İphone aratır
    When kullanıcı amazon anasayfasında
    And kullanıcı İphone için arama yapar
    Then sonuçların İphone içerdiğini test eder
    And sayfayı kapatır


