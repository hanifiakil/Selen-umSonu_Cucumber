Feature: US1012 kullanıcı register yapabilmeli

  @aut
  Scenario: TC17 kullanıcı uygun datalarla register olabilmeli

    Given kullanıcı "automationUrl" anasayfasında
    And user sing in linkine tıklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kişisel bilgilerini ve iletişim bilgilerini girer
    And user Register butonuna basar
    Then hesap oluşturduğunu doğrular
    And sayfayı kapatır

