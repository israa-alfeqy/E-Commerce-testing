package stepDifinations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginStepDif {
    LoginPage login = new LoginPage();

    @Given("go to login page")
    public void loginTab() throws InterruptedException {

        Thread.sleep(3000);
        login.loginTab.click();

    }



    @When("^login with \"(.*)\" and \"(.*)\"$")
    public void enterCredentials(String email, String password){
        login.enterCredentialsSteps(email, password);

    }

    @And("press on login button")
    public void loginButton() throws InterruptedException {
        login.loginButton0.click();
        Thread.sleep(3000);
    }

    @Then("login to the system successfully")
    public void successfulLogin() throws InterruptedException {
       // Thread.sleep(3000);
       // Hooks.soft.assertTrue(login.myAccount.isDisplayed(), "first assertion failed");
     //   Hooks.soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "second assertion failed");
      //  Hooks.soft.assertAll();

    }

    @Then("user could not login to the system")

    public void unsuccessfulLogin() throws InterruptedException {
       // Thread.sleep(3000);
       // Hooks.soft.assertTrue(login.unsuccessfulMsg.getText().contains("Login was unsuccessful"), "first assertion failed");
        //Hooks.soft.assertEquals(login.unsuccessfulMsg.getCssValue("color"), "rgba(228, 67, 75, 1)","second assertion failed");
       // System.out.println(login.unsuccessfulMsg.getCssValue("color"));
       // Hooks.soft.assertAll();


    }

}
