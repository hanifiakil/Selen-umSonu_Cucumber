Feature: US1009 Datatables sitesine 5 farklı giriş yapalım
@datatable
  Scenario Outline: TC14 kullanıcı 5 farklı kayıt girişi yapabilmeli

    When kullanıcı "datatablesUrl" anasayfasında
    Then new butonuna basar
    And isim bölümüne "<firstname>" yazar
  And soyisim bölümüne "<lastName>" yazar
  And position bölümüne "<position>" yazar
  And ofis bölümüne "<office>" yazar
  And extension bölümüne "<extension>" yazar
  And startDate bölümüne "<startDate>" yazar
  And salary bölümüne "<salary>" yazar
    And Create tuşuna basar
    When kullanıcı "<firstname>" ile arama yapar
    Then isim bölümünde "<firstname>" olduğunu test eder
    And sayfayı kapatır

    Examples:
    |firstname|lastName|position|office|extension|startDate|salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
    |Hüseyin  |Kaçmaz  |BA      |berlin|-        |2022-07-10|40000|
    |Fatih    |Şahin   |PO      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|


