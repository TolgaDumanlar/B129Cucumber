

  @GoogleSearch
  Feature: Google_Search

    Background: kullanici_google_anasayfaya_gider
      Given kullanici_google_anasayfaya_gider

    Scenario: TC01_Java_Search
      When kullanici googleda "Java" aratir
      Then title'in "Java" icerdigini dogrula
      And sayfayi_kapatir

    Scenario: TC02_SQL_Search
      When kullanici googleda "SQL" aratir
      Then title'in "SQL" icerdigini dogrula
      And sayfayi_kapatir


    Scenario: TC03_JDBC_Search
      When kullanici googleda "JDBC" aratir
      Then title'in "JDBC" icerdigini dogrula
      And sayfayi_kapatir

    Scenario: TC04_Selenium_Search
      When kullanici googleda "Selenium" aratir
      Then title'in "Selenium" icerdigini dogrula
      And sayfayi_kapatir

    Scenario: TC05_Lambda_Search
      When kullanici googleda "Lambda" aratir
      Then title'in "Lambda" icerdigini dogrula
      And sayfayi_kapatir