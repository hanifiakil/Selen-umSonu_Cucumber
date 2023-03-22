#hotel my camp sitesinde 3 adet negative test senaryosu oluşturalım
  #doğru username yanlış password
  #yanlış username doğru password
  #yanlış username yanlış password
Feature: US1006 yanlış bilgilerle siteye giriş yapılmaz
@CH2
  Scenario: TC09 yanlış password ile giriş yapılmaz
    When kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And geçerli username girer
    And geçersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilmadığını test eder
    And sayfayı kapatır