package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButton.click();
    }

    @Then("isim bölümüne {string} yazar")
    public void isim_bölümüne_yazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @Then("soyisim bölümüne {string} yazar")
    public void soyisim_bölümüne_yazar(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @Then("position bölümüne {string} yazar")
    public void position_bölümüne_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @Then("ofis bölümüne {string} yazar")
    public void ofis_bölümüne_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Then("extension bölümüne {string} yazar")
    public void extension_bölümüne_yazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @Then("startDate bölümüne {string} yazar")
    public void start_date_bölümüne_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @Then("salary bölümüne {string} yazar")
    public void salary_bölümüne_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("Create tuşuna basar")
    public void create_tuşuna_basar() {
        dataTablesPage.createButton.click();
    }

    @When("kullanıcı {string} ile arama yapar")
    public void kullanıcıIleAramaYapar(String firstname) {
   dataTablesPage.searchKutusu.sendKeys(firstname);
    }


    @Then("isim bölümünde {string} olduğunu test eder")
    public void isimBölümündeOlduğunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.isimAramaIlkSatir.getText().contains(firstname));
    }
}

