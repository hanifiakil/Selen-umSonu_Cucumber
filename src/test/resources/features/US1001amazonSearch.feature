@tümü
Feature: US1001 Kullanıcı Amazon Sayfasında Arama Yapar
@nutellaara
  Scenario: TC01 kullanıcı amazonda Nutella aratır

    Given kullanıcı amazon anasayfasında
    Then kullanıcı Nutella için arama yapar
    And sonuçların Nutella içerdiğini test eder
    And sayfayı kapatır
@java  @ikisi
  Scenario: TC02 kullanıcı amazonda Java aratır
    Given kullanıcı amazon anasayfasında
    Then kullanıcı Java için arama yapar
    And sonuçların Java içerdiğini test eder
    And sayfayı kapatır
@ıphome  @ikisi
  Scenario: TC03 kullanıcı İphone aratır
    When kullanıcı amazon anasayfasında
    And kullanıcı İphone için arama yapar
    Then sonuçların İphone içerdiğini test eder
    And sayfayı kapatır
@fatma
  Scenario: TC04 kullanıcı fatma aratır
    When kullanıcı amazon anasayfasında
    And kullanıcı fatma için arama yapar
    Then sonuçların fatma içerdiğini test eder
    And sayfayı kapatır


