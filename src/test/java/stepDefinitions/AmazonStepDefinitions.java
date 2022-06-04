package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();


    @Given("kullanici amazon ana sayfasinda")
    public void kullanici_amazon_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.searchBoxElement.sendKeys("Nutella" + Keys.ENTER);

    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String actualResultsText = amazonPage.searchResultsElement.getText();
        String expectedWord = "Nutella";
        Assert.assertTrue(actualResultsText.contains(expectedWord));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.searchBoxElement.sendKeys("Java" + Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String actualResultsText = amazonPage.searchResultsElement.getText();
        String expectedWord = "Java";
        Assert.assertTrue(actualResultsText.contains(expectedWord));
    }
    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBoxElement.sendKeys("iphone" + Keys.ENTER);


    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualResultsText = amazonPage.searchResultsElement.getText();
        String expectedWord = "iphone";
        Assert.assertTrue(actualResultsText.contains(expectedWord));

    }


}
