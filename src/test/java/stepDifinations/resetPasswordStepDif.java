package stepDifinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import pages.ResetPassword;

public class resetPasswordStepDif {

    LoginPage loginPage;
    ResetPassword resetPasswordPage;

    @And("user clicked on forgot password")
    public void userClickedOnForgotPassword() {
        loginPage = new LoginPage();
        loginPage.clickLogIn();
        loginPage.clickForgetPassword();
    }

    @And("user entered email for reset password")
    public void userEnteredEmailForResetPassword() {
        resetPasswordPage = new ResetPassword();
        resetPasswordPage.enterEmail("test1997@example.com");
    }

    @And("user clicked on recover button")
    public void userClickedOnRecoverButton() {
        resetPasswordPage.clickOnRecoverBtn();
    }

    @Then("user should have a success message for recover")
    public void userShouldHaveASuccessMessageForRecover() {
        String resetMessage = Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(resetMessage, "Email with instructions has been sent to you.");
    }


}


