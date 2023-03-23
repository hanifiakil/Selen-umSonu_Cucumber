Feature: US1009 Datatables sitesine 5 farklı giriş yapalım

  Scenario Outline: TC14 kullanıcı 5 farklı kayıt girişi yapabilmeli

    When kullanıcı "datatablesUrl" anasayfasında
    Then new butonuna basar
    And tüm bilgileri girer
    And Create tuşuna basar
    When kullanıcı ilk isim ile arama yapar
    Then isim bölümünde isminin olduğunu doğrular
    And sayfayı kapatır

    Examples:
    |firstname|lastName|position|office|extension|startDate|salary|


