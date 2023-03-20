Feature: US1003 kullanıcı parametre kullanarak arama yapabilmeli

 @parametre
  Scenario: TC06 kullanıcı parametre ile amazon da arama yapabilmeli
    Given kullanıcı amazon anasayfasında
    And kullanıcı "java" için arama yapar
    And sonuçların "java" içerdiğini test eder
    Then sayfayı kapatır