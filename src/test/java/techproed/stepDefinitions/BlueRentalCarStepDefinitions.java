package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class BlueRentalCarStepDefinitions {
    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();
    @Given("kullanici blue rental car sayfasini gider")
    public void kullanici_blue_rental_car_sayfasini_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcar_Url"));

    }
    @When("login olur")
    public void login_olur(DataTable dataTable) {

        blueRentalCarPage.loginButton.click();

    }
}