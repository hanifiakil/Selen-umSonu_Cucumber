package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber da step definitions package i içerisinde @before.@after gibi bir notasyon varsa
    extends testBase dememize gerek kalmadan
    her senaryodan önce ve/veya sonra bu method lar çalışacaktır

    buda bizim isteyeceğimiz bir durum değildir

    Cucumber da @before, @after kullanma ihtiyacımız olursa
    bunu stepdefinitions package i altında oluşturacağımız
    hooks class ına koyarız

    biz her senaryodan sonra test sonucunu kontrol edip
    failde olan scenario için screenshoot olması amacıyla
    @After method u kullanacağız

     */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
