package UI.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("page:webdriver.base.url")
public class LoginPage extends PageObject {

    //Web elements of login page
    @FindBy(xpath = "//*[@id='user_email']")
    WebElement emailTextField;

    @FindBy(xpath = "//*[@id='submit_email_button']")
    WebElement emailSubmitButton;

    @FindBy (xpath = "//*[@id='user_password']")
    WebElement passwordTextField;

    @FindBy(xpath = "//*[@id='submit_password_button']")
    WebElement signInButton;

    //Functions
    public void fillInEmail() {
        emailTextField.sendKeys("matthew.simpson@2itesting.com");}

    public void clickEmailSubmitButton() {
        emailSubmitButton.click();}

    public void fillInPassword() {
        passwordTextField.sendKeys("2itesting1234");}

    public void clickLoginSubmitButton(){
        signInButton.click();
    }

}
