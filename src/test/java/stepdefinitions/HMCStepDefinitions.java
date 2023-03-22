package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
HMCPage hmcPage=new HMCPage();
    @Then("Log in yazısına tıklar")
    public void log_in_yazısına_tıklar() {
hmcPage.loginLinki.click();
    }
    @Then("geçerli username girer")
    public void geçerli_username_girer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    @Then("geçerli password girer")
    public void geçerli_password_girer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
hmcPage.loginButonu.click();
    }
    @Then("sayfaya giris yapildigini test eder")
    public void sayfaya_giris_yapildigini_test_eder() {
Assert.assertTrue(hmcPage.girisYapildiKontrolYazi.isDisplayed());
    }

    @And("geçersiz password girer")
    public void geçersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilmadığını test eder")
    public void sayfayaGirisYapilmadığınıTestEder() {
   Assert.assertTrue(hmcPage.girisYapilamadiYazisiElementi.isDisplayed());
    }
}
