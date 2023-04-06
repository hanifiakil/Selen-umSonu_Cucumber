package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",   //Runner dosyasının feature dosyalarını nereden bulacagını tarif eder

        glue = "stepdefinitions",   //step definitions dosyalarını nereden bulacagımızı gösterir

        tags = "@aut",   //o an hangi tag ı çalıştırmak istiyorsak onu belli eder

        dryRun = true   // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir
        // dryRun=false yaparsak testi calistirir, eksik bir adimla karsilasirsa
        // test failed olur ve bize eksik adimi raporlar

)
public class TestRunner {

    /*
    bir framework te bir tek Runner class ı yeterli olabilir
    Runner class ında class bady sinde hiç bir şey olmaz
    Runner class ımızı önemli yapan 2 annotaion vardır
    @RunWith(Cucumber.class) notasyonu Runner class ına çalışma özelliği katar
    Bu notasyon için Cucumber framework umuzde JUnit kullanmayı tercih diyoruz

     */
}
