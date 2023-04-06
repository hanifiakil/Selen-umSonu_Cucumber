#hotel my camp sitesinde 3 adet negative test senaryosu oluşturalım
  #doğru username yanlış password
  #yanlış username doğru password
  #yanlış username yanlış password
Feature: US1006 yanlış bilgilerle siteye giriş yapılmaz
@CH2 @pr2
  Scenario: TC09 yanlış password ile giriş yapılmaz
    When kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And geçerli username girer
    And geçersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilmadığını test eder
    And sayfayı kapatır

  @CH3 @pr1
  Scenario: TC10 yanlış kullanıcı ile giriş yapılamaz
    When kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And geçersiz username girer
    And geçerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilmadığını test eder
    And sayfayı kapatır

  @CH4 @pr2
  Scenario: TC11 yanlış kullanıcı adı ve yanlış şifre ile giriş yapılamaz
      When kullanıcı "HMCUrl" anasayfasında
      Then Log in yazısına tıklar
      And geçersiz username girer
      And geçersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilmadığını test eder
      And sayfayı kapatır