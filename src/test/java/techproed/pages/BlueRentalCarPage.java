package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalCarPage {

    public BlueRentalCarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;
}