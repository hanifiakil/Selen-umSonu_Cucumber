Feature: US1010 web tablosundaki istenen sütunu yazdırma
@guru
  Scenario: TC15 kullanıcı sütun başlığı ile liste alabilme

Given kullanıcı "guruUrl" anasayfasında
    And "Company" sütunundaki tüm değerleri yazdırır
    And sayfayı kapatır



