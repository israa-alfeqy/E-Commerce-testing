package stepDifinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WishPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishStepDif {

   WishPage home = new WishPage();




    @When("user clicks add to  wishlist button")
    public void clickWishlist(){
        home.wishlistBtn.click();
    }

    @Then("a success message is displayed at the top of the page")
    public void success(){


        Hooks.soft.assertTrue(home.success.getText().contains("The product has been added to your"));

        Hooks.soft.assertEquals(home.msgBackground.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        Hooks.soft.assertAll();
    }



    @And("user goes on Wishlist page")
    public void clickWishlistTab(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(home.success));
        home.wishlistTab.click();


    }

    @Then("the quantity value is bigger than 0")
    public void quantityIncreased(){

        int quantity = Integer.parseInt(home.quantity.getAttribute("value"));
        //System.out.println(quantity);
        Hooks.soft.assertTrue( quantity > 0);
        // Hooks.soft.assertAll();
    }
}