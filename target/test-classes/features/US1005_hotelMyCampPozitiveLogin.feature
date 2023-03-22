Feature: US1005 kullanıcı doğru bilgilerle sayfaya girebilmeli
  
  @CH1
  Scenario: TC08 pozitive login testi
    When kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And geçerli username girer
    And geçerli password girer
    And Login butonuna basar
    Then sayfaya giris yapildigini test eder
    And sayfayı kapatır