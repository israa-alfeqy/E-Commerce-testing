package stepDifinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.asserts.*;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;

public class registerStepDif {
    RegisterPage registration = new RegisterPage();
    @Given("go to registration page")
    public void RegistrationPage()
    {


        //System.out.println("This is a test before start coding");
       registration.registerBtn.click();
    }

    @When("select gender type")
    public void genderType(){
        //System.out.println("user select gender type");
       registration.genderRadio.click();

    }

    @And("enter first name \"tester\" and last name \"tester\"")
    public void name(){
        registration.firstNameField.sendKeys("tester");
        registration.lastNameField.sendKeys("tester");

    }
    @And("enter date of birth")
    public void birthDate(){
        Select dropDay = new Select(RegisterPage.DateOfBirthDay);
        dropDay.selectByVisibleText("19");

        Select dropMonth = new Select(RegisterPage.DateOfBirthMonth);
        dropMonth.selectByVisibleText("May");

        Select dropYear = new Select(RegisterPage.DateOfBirthYear);
        dropYear.selectByVisibleText("1992");


    }

    @And("enter email \"test@example.com\" field")
    public void mail (){
        registration.mailField.sendKeys("test1997@example.com");

    }

    @And ("fill Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void passwords(){
        registration.password.sendKeys("P@ssw0rd");
        registration.ConfirmPassword.sendKeys("P@ssw0rd");


    }

    @And("click on register button")
    public void clickRegister(){
        registration.finalRegisterBtn.click();

    }
    @Then("success message is displayed")
    public void successMsg() throws InterruptedException {
     //   Thread.sleep(3000);



        //Hooks.soft.assertTrue(registration.successMsg.getText().contains("Your registration completed"), "First Assertion Failed, no MSG");
        //Hooks.soft.assertEquals(registration.successMsg.getCssValue("color"), "rgba(76, 177, 124, 1)", "Second Assertion Failed" );

    }

}
