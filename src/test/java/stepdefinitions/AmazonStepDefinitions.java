package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanıcı amazon anasayfasında")
    public void kullanıcı_amazon_anasayfasında() {
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanıcı Nutella için arama yapar")
    public void kullanıcı_nutella_için_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("sonuçların Nutella içerdiğini test eder")
    public void sonuçların_nutella_içerdiğini_test_eder() {
        String arananKelime="Nutella";
        String arananSonuçElementi=amazonPage.aramasonuçElementi.getText();

        Assert.assertTrue(arananSonuçElementi.contains(arananKelime));
    }
    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
         Driver.closeDriver();
    }

    @Then("kullanıcı Java için arama yapar")
    public void kullanıcı_java_için_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("sonuçların Java içerdiğini test eder")
    public void sonuçların_java_içerdiğini_test_eder() {
        String arananKelime="Java";
        String arananSonuçElementi=amazonPage.aramasonuçElementi.getText();

        Assert.assertTrue(arananSonuçElementi.contains(arananKelime));
    }

    @And("kullanıcı İphone için arama yapar")
    public void kullanıcıİphoneIçinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("İphone" + Keys.ENTER);
    }

    @Then("sonuçların İphone içerdiğini test eder")
    public void sonuçlarınİphoneIçerdiğiniTestEder() {
        String arananKelime="İphone";
        String arananSonuçElementi=amazonPage.aramasonuçElementi.getText();

        Assert.assertTrue(arananSonuçElementi.contains(arananKelime));
    }

    @And("kullanıcı fatma için arama yapar")
    public void kullanıcıFatmaIçinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("fatma"+Keys.ENTER);
    }

    @Then("sonuçların fatma içerdiğini test eder")
    public void sonuçlarınFatmaIçerdiğiniTestEder() {
        String arananKelime="fatma";
        String arananSonuçElementi=amazonPage.aramasonuçElementi.getText();

        Assert.assertTrue(arananSonuçElementi.contains(arananKelime));
    }

    @Given("kullanıcı {string} için arama yapar")
    public void kullanıcı_için_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }
    @Given("sonuçların {string} içerdiğini test eder")
    public void sonuçların_içerdiğini_test_eder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String arananSonuçElementi=amazonPage.aramasonuçElementi.getText();

        Assert.assertTrue(arananSonuçElementi.contains(arananKelime));
    }

    @Given("kullanıcı {string} anasayfasında")//amazonUrl
    public void kullanıcıAnasayfasında(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} içerdiğini test eder")
    public void urlInIçerdiğiniTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanıcı {int} saniye bekler")
    public void kullanıcıSaniyeBekler(int istenensaniye) throws InterruptedException {
        Thread.sleep(istenensaniye*1000);
    }
}
