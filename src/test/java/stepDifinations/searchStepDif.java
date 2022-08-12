package stepDifinations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;

public class searchStepDif {

    HomePage home = new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;


    String productName;
    String sku;


    //first scenario outline

    @Given("navigates to search page")
    public void searchPage() {
        js.executeScript("arguments[0].scrollIntoView();", home.searchPage);
        home.searchPage.click();
    }

    @When("^enters (.*)$")
    public void enterProductName(String productName) {
        home.searchBox.sendKeys(productName);
    }

    @And("click search button")
    public void clickSearchBtn() {
        home.searchBtn.click();
    }

    @Then("^search results contains (.*)$")

    public void searchResults(String productName) {

        Hooks.soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q"), "url assertion failed");

        System.out.println("number of search results:" + home.searchResults.size());

        for (WebElement result : home.searchResults) {

            System.out.println(result.getText());
            Hooks.soft.assertTrue(result.getText().toLowerCase().contains(productName), "result doesn't contain search criteria");

        }

        Hooks.soft.assertAll();


    }

    //second scenario outline

    @When("^types product (.*)$")
    public void enterSku(String sku) {
        home.searchBox.sendKeys(sku);
    }


    @And("click a result from search results")
    public void userClicksResult() {
        home.searchResult.click();
    }

    @Then("^search results (.*) match search criteria$")
    public void compareSku(String sku) {
        System.out.println(home.sku.getText());
        Assert.assertEquals(home.sku.getText(), sku);

    }
}