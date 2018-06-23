package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by 1 on 19.06.2018.
 */
public class MarketSteps {

//    @Step("выполнено нажатие на кнопку Да {0}")
//    public void stepButtonYes() {
//        new MarketPage().stepcityButton.click();
//    }

    @Step("выбран раздел меню {0}")
    public void stepselectMenuMarket(String menuItem) {
        new MarketPage().selectMenuMarket(menuItem);
    }
   @Step("выбран пункт меню Электроника{0}")
   public void stepselectMenuElectro(String menuItem) {
       new MarketPage().selectMenuElectro(menuItem);
    }

    @Step("нажата кнопка - Да, всё верно")
    public void regionDefenitionYesButton(){
        new MarketPage().regionDefenitionYesButton();
    }
}
