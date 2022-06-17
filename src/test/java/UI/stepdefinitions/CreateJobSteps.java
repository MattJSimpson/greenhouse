package UI.stepdefinitions;

import UI.pages.DashboardPage;
import UI.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class CreateJobSteps extends PageObject {

    @Steps
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("I have successfully logged into Greenhouse")
    public void i_have_successfully_logged_into_greenhouse() {

    }
    @When("I click the create a job button")
    public void i_click_the_create_a_job_button() {

    }
    @Then("I am able to copy an existing job")
    public void i_am_able_to_copy_an_existing_job() {

    }
    @And("save the job")
    public void save_the_job() {
    }
}
