package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by 1 on 18.06.2018.
 */
public class MainPage {
    WebDriver driver;

    @FindBy(xpath = "//DIV[@class='home-tabs stream-control i-bem dropdown-menu home-tabs_js_inited']/self::DIV")
    WebElement mainMenu;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);

    }
    //3. Перейти в яндекс маркет
    public void selectMainMenu(String menuItem){
      mainMenu.findElement(By.xpath("//A[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][text()='"+menuItem+"']")).click();
    }
}
