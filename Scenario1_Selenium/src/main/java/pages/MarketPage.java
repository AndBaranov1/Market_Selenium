package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import static steps.BaseSteps.driver;

/**
 * Created by 1 on 19.06.2018.
 */
public class MarketPage {

    //меню маркета
    @FindBy(xpath = "//UL[@class='topmenu__list']/self::UL")
    WebElement menuMarket;

   @FindBy(xpath ="//*[@class='topmenu__list']")
   WebElement menuElectro;
    @FindBy(xpath = "//*[@class='button2 button2_size_m button2_theme_action button2_width_max n-region-notification__actions-btn n-region-notification__ok']")
    WebElement regionDefenitionYesButton;


    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }
    public void regionDefenitionYesButton(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.driver, 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(regionDefenitionYesButton)).click();
    }
    //4. Выбрать раздел Электроника
    public void selectMenuMarket(String menuItem) {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//A[@class='link topmenu__link'][text()='"+menuItem+"']"))).build().perform();
    }


     //5. Выбрать раздел Телевизоры
     public void selectMenuElectro(String menuItem) {
//         Wait<WebDriver> wait = new WebDriverWait(driver, 15, 1000);
//         WebElement menuElectro = driver.findElement(By.xpath(".//*[text()='"+menuItem+"']"));
//         wait.until(ExpectedConditions.visibilityOf(menuElectro)).click();

         Wait<WebDriver> wait = new WebDriverWait(BaseSteps.driver, 15, 1000);
         wait.until(ExpectedConditions.visibilityOf(menuElectro.findElement(By.xpath(".//*[text()='"+menuItem+"']")))).click();

    }

}
