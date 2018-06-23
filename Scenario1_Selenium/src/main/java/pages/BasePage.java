package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by 1 on 19.06.2018.
 */
public class BasePage {

    BasePage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void fillField(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void waitElement (WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 30, 1000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
