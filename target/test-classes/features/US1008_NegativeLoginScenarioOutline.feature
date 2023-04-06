Feature: US1008 kullanıcı farklı yanlış şifre ve kullanıcı adıyla giriş yapamaz

@CH06 @sıralı
  Scenario Outline: TC13 yanlış kullanıcı adı ve şifrelerle giriş yapılamaz
    When kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And geçersiz username olarak "<username>" girer
    And geçersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilmadığını test eder
    And sayfayı kapatır

    Examples:
    |username|password |
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|