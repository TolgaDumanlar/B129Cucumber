package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MedunnaPage {

    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement kullaniciSimgesi;

    @FindBy(id = "login-item")
    public WebElement signInSecenegi;

    @FindBy(id = "username")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeRadioButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;



}
