package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruPage {
    GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
