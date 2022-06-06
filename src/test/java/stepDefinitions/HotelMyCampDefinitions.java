package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampDefinitions {
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    @Given("kullanici hotelmycamp adresine gider")
    public void kullanici_hotelmycamp_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
    }

    @Then("kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() {
        hotelMyCampPage.logOnButton.click();

    }

    @Then("kullanici test data username: manager olarak girer")
    public void kullanici_test_data_username_manager_olarak_girer() {
        hotelMyCampPage.usernameInput.sendKeys("manager");

    }

    @When("kullanici test data password : Manager1! Degerleri girildiginde")
    public void kullanici_test_data_password_manager1_degerleri_girildiginde() {
        hotelMyCampPage.passwordInput.sendKeys("Manager1!");
        hotelMyCampPage.logInButtonSubmit.click();

    }

    @When("kullanici sayfaya basarili sekilde girilebildigini test eder.")
    public void kullanici_sayfaya_basarili_sekilde_girilebildigini_test_eder() {
        Assert.assertTrue(hotelMyCampPage.entryStatement.isDisplayed());

    }
    @And("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
