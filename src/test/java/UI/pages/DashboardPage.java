package UI.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertEquals;

public class DashboardPage extends PageObject{

    //Web elements of dashboard page
    @FindBy(xpath = "//*[@class='nav-title']")
    WebElement dashboardHeader;

    @FindBy(xpath = "//*[@class='xicon__XIcon-sc-qxnb6m-0 shared__CloseIcon-sc-ool5jt-5 ePkLxn eDvzbP']")
    WebElement dashboardPopups;

    public String checkTitle() { return dashboardHeader.getText();
    }

//    public void closeDashboardPopups () {
//        dashboardPopups.click();
//        dashboardPopups.click();
//        dashboardPopups.click();
//    }
}
