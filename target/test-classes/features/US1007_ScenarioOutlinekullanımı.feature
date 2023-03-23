#amazon sayfasına gidip nutella java elma armut aratıp
  #sonuçların arama yaptığımız kelimeyi içerdiğini test edelim
  Feature: US1007 kullanıcı amazonda istediği kelimeleri aratır

    Scenario Outline: TC12 amazon listedeki elementleri aratma

      Given kullanıcı "amazonUrl" anasayfasında
      Then kullanıcı "<istenenKelime>" için arama yapar
      And sonuçların "<istenenKelime>" içerdiğini test eder
      And sayfayı kapatır

      Examples:
      |istenenKelime|
      |nutella      |
      |java         |
      |elma         |
      |armut        |