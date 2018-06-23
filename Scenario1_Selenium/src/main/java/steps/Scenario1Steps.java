package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by 1 on 19.06.2018.
 */
public class Scenario1Steps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    FilterSteps filterSteps = new FilterSteps();


    @When("^выбран пункт меню \"(.+)\"$")
    public void stepSelectMainMenu(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }
     @When("^выбран раздел меню \"(.+)\"$")
    public void stepselectMenuMarket(String menuItem) {
         marketSteps.stepselectMenuMarket(menuItem);
     }

    @When("^выбран пункт меню Электроника \"(.+)\"$")
    public void stepselectMenuElectro(String menuItem) {
        marketSteps.stepselectMenuElectro(menuItem);
    }
    @When("^в всплывающем окне Ваш регион нажата кнопка - Да, всё верно")
    public void regionDefenitionYesButton(){
        marketSteps.regionDefenitionYesButton();
    }
    @When("нажата кнопка Перейти ко всем фильтрам")
    public void stepselectadvancedFilter() {
        filterSteps.stepselectadvancedFilter();
    }
    @When("^заполняются поля:$")
    public void stepFillField(DataTable fields) {
        fields.asMap(String.class, String.class).forEach((key, value) -> filterSteps.stepFillField(key, value));
    }
    @Then("выбран производитель Samsung")
    public void stepchBoxSamsung() {
        filterSteps.stepchBoxSamsung();
    }
    @Then("выбран производитель LG")
    public void stepchBoxLg() {
        filterSteps.stepchBoxLg();
    }
    @Then("выбран производитель Beats")
    public void stepchBoxBeats() {
        filterSteps.stepchBoxBeats();
    }
    @Then("нажата кнопка Показать подходящие")
    public void stepapplyButton() {
        filterSteps.stepapplyButton();
    }
    @When("^количество элементов товара (\\d+)$")
    public void countElementsTv(int countTv) {
      filterSteps.countElementsTv(countTv);
    }
    //1
    @When("^поиск первого элемента из списка телевизоров$")
    public void firstElemSearchTv(){
        filterSteps.firstElemSearch1();
    }
    //2
    @When("^поиск первого элемента из списка наушников$")
    public void firstElemSearchHp(){
        filterSteps.firstElemSearchHp();
    }
    @When("^в строку поиска введено значение первого элемента$")
    public void fillSearchField(){
        filterSteps.fillSearchField();
    }
    @When("^проверка наименования товара Tv, соответствует запомненному значению$")
    public void checkTheFilledTv(){
        filterSteps.checkTheFilledTv();
    }
    @When("^проверка наименования товара наушников, соответствует запомненному значению$")
    public void checkTheFilledHp(){
        filterSteps.checkTheFilledHp();
    }
}
