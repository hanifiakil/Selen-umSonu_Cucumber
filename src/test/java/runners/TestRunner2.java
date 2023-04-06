package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},
        features = "src/test/resources/features",   //Runner dosyasının feature dosyalarını nereden bulacagını tarif eder

        glue = "stepdefinitions",   //step definitions dosyalarını nereden bulacagımızı gösterir

        tags = "@pr2",   //o an hangi tag ı çalıştırmak istiyorsak onu belli eder

        dryRun = false   // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir
        // dryRun=false yaparsak testi calistirir, eksik bir adimla karsilasirsa
        // test failed olur ve bize eksik adimi raporlar

)

public class TestRunner2 {
}
