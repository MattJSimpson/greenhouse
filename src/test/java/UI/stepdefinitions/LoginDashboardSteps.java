package UI.stepdefinitions;

import UI.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import UI.pages.LoginPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.Keys;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.contains;

public class LoginDashboardSteps extends PageObject {

    @Steps
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
    loginPage.open();
    }

    @Then("I enter my login details")
    public void iEnterMyLoginDetails() throws InterruptedException {
        loginPage.fillInEmail();
        loginPage.clickEmailSubmitButton();
        loginPage.fillInPassword();
        loginPage.clickLoginSubmitButton();
        Thread.sleep(5000);
//        dashboardPage.closeDashboardPopups();
    }

    @And("Successfully login to the Greenhouse dashboard")
    public void successfullyLoginToTheGreenhouseDashboard() {
        assertEquals("My Dashboard", dashboardPage.checkTitle());
    }
}
