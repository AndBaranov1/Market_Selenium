package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by 1 on 20.06.2018.
 */
public class FilterSteps {
    FilterPage filterPage = new FilterPage(BaseSteps.driver);
    //6. Зайти в расширенный поиск
    @Step("нажата кнопка Перейти ко всем фильтрам")
    public void stepselectadvancedFilter() {
        new FilterPage(BaseSteps.driver).selectadvancedFilter(BaseSteps.driver);
    }

    @Step("поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value) {
        new FilterPage(BaseSteps.driver).fillField(field, value);
    }
    @Step("выбран производитель Samsung")
    public void stepchBoxSamsung() {
        new FilterPage(BaseSteps.driver).chBoxSamsung.click();
    }
    @Step("выбран производитель LG")
    public void stepchBoxLg() {
        new FilterPage(BaseSteps.driver).chBoxLg.click();
    }
    @Step("выбран производитель Beats")
    public void stepchBoxBeats() {
        new FilterPage(BaseSteps.driver).chBoxBeats.click();
    }
    @Step("нажата кнопка Показать подходящие")
    public void stepapplyButton() {
        new FilterPage(BaseSteps.driver).applyButton.click();
    }
    @Step("количество элементов товара")
    public void countElementsTv(int countTv) {
        //new FilterSteps(BaseSteps.driver).countElementsTv(countTv);
        filterPage.countElementsTv(countTv);
    }
    @Step("поиск первого элемента из списка телевизоров")
    public void firstElemSearch1(){
        filterPage.firstElemSearchTv();
    }
    @Step("поиск первого элемента из списка наушников")
    public void firstElemSearchHp(){
        filterPage.firstElemSearchHp();
    }
    @Step("в строку поиска введено значение первого элемента")
    public void fillSearchField(){
        filterPage.fillSearchField();
        filterPage.selectSubmitSearch();
    }
    @Step("проверка наименования товара Tv, соответствует запомненному значению")
    public void checkTheFilledTv(){
        filterPage.checkTheFilledTv();
    }
    @Step("проверка наименования товара наушников, соответствует запомненному значению")
    public void checkTheFilledHp(){
        filterPage.checkTheFilledHp();
    }

}
