package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 20.06.2018.
 */
public class FilterPage {
    //6. Зайти в расширенный поиск
    @FindBy(xpath = "//A[@class='_1z9VjXlbXw'][text()='Перейти ко всем фильтрам']")
    WebElement advancedFilter;

    // 7. Задать параметр поиска от 20000 рублей.
    @FindBy(xpath = "//INPUT[@id='glf-pricefrom-var']")
    public WebElement priceFrom;

    // 8. Выбрать производителей Samsung и LG
    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='Samsung']")
    public WebElement chBoxSamsung;
    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='LG']")
    public WebElement chBoxLg;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='Beats']")
    public WebElement chBoxBeats;

    //9. Нажать кнопку Применить
    @FindBy(xpath = "(//A[@role='button'])[4]")
    public WebElement applyButton;

    @FindBy(css = "#header-search")
    WebElement searchField;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitSearch;


    public FilterPage(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void setElementTitle(String elementTitle) {
        this.elementTitle = elementTitle;
    }

    public String getElementTitle() {
        return elementTitle;
    }
    public String elementTitle;

    public void selectadvancedFilter(WebDriver driver) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(advancedFilter)).click();
    }

    public void fillField(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Сумма от":
                fillField(priceFrom, value);
                break;

        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Сумма от":
                return priceFrom.getAttribute("value");
        }
        throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
    }
    //10. Проверить, что элементов на странице 48.
    public void countElementsTv(int countTv) {
        int elemTv = BaseSteps.driver.findElements(By.xpath("//*[contains(@data-id,'model')]")).size();
        assertEquals(countTv,elemTv);
    }


    public void firstElemSearchTv(){
        List<WebElement> element = BaseSteps.driver.findElements(By.xpath("//*[@class='n-snippet-card2__title']/a"));
        setElementTitle(element.get(0).getAttribute("title"));

    }
    public void firstElemSearchHp(){
        List<WebElement> element = BaseSteps.driver.findElements(By.xpath("//*[@class='image']/../*[contains(@title,'Наушники')]"));
        setElementTitle(element.get(0).getAttribute("title"));

    }

    public void fillSearchField(){
        searchField.clear();
        searchField.sendKeys(getElementTitle());
    }
    public void selectSubmitSearch(){
        submitSearch.click();
    }


    public void checkTheFilledTv(){
        String findResult = BaseSteps.driver.findElement(By.xpath("//*[@class='title title_size_28 title_bold_yes']")).getText();;
        assertEquals(getElementTitle(), findResult);

    }


    public void checkTheFilledHp(){
        String title = getElementTitle();
        List<WebElement> findResult = BaseSteps.driver.findElements(By.xpath("//*[@class='image']/../*[contains(@title,'"+title+"')]"));
        String findRes = findResult.get(0).getAttribute("title");
        assertEquals(getElementTitle(), findRes);

    }
    public void applyButton() throws InterruptedException {
        Thread.sleep(3000);
        applyButton.click();
    }
}

