package UI.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import UI.pages.LoginPage;
import net.thucydides.core.annotations.Steps;

public class LoginDashboardSteps {

    @Steps
    LoginPage loginPage;

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
    loginPage.open();
    }

    @Then("I enter my login details")
    public void iEnterMyLoginDetails() {
        loginPage.fillInEmail();
        loginPage.clickEmailSubmitButton();
        loginPage.fillInPassword();
        loginPage.clickLoginSubmitButton();
    }

    @And("Successfully login to the Greenhouse dashboard")
    public void successfullyLoginToTheGreenhouseDashboard() {

    }


}
