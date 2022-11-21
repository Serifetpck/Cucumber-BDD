package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataBasePage;
import utulities.ConfigReader;
import utulities.Driver;


public class DataTableStepDefinition {
    DataBasePage data = new DataBasePage();
    Actions actions = new Actions(Driver.getDriver());
    @When("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        data.newButton.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String firstName) {
        data.firstname.sendKeys(firstName);
    }


    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String ofis) {
        actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("startDate bolumune {string} yazar")
    public void startdateBolumuneYazar(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        data.search.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String isim) {
        Assert.assertTrue(data.isimVar.getText().contains(isim));
    }
}