package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage=new GuruPage();

    @Given("{string} sütunundaki tüm değerleri yazdırır")
    public void sütunundaki_tüm_değerleri_yazdırır(String istenenSütun) {

        List<WebElement> tabloBaşlıkListesi=guruPage.başlıkListesi;
        //Listemiz webelementlerdwn oluşuyor
        //dolayısıyla bu webelementlerden hangisi
        //istenen sütun başlığını taşıyor bilemeyiz
int istenenBaşlıkİndexi=-3;
        for (int i = 0; i < tabloBaşlıkListesi.size(); i++) {
            if (tabloBaşlıkListesi.get(i).getText().equals(istenenSütun)){
                istenenBaşlıkİndexi=i+1;
                break;
            }
        }
        //for loop ile tüm sütun başlıklarını bana verilen istenenSütun değeri ile karşılaştıralım
        //loop bittiğinde başlığın bulunup bulunmadığını kontrol etmek ve
        //bulundu ise yoluma devam etmek istiyorum

        if (istenenBaşlıkİndexi !=-3){//başlık bulundu
            List<WebElement> istenenSütundakiElementler= 
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaşlıkİndexi+"]"));
            for (WebElement each:istenenSütundakiElementler
                 ) {
                System.out.println(each.getText());
            }

        }else {//başlık bulunamadı
            System.out.println("istenen başlık bulunamadı");
        }
    }

}
