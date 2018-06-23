import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *  Сценарий №1
 1. Открыть браузер и развернуть на весь экран.
 2. Зайти на yandex.ru.
 3. Перейти в яндекс маркет
 4. Выбрать раздел Электроника
 5. Выбрать раздел Телевизоры
 6. Зайти в расширенный поиск
 7. Задать параметр поиска от 20000 рублей.
 8. Выбрать производителей Samsung и LG
 9. Нажать кнопку Применить.
 10. Проверить, что элементов на странице 12.
 11. Запомнить первый элемент в списке.
 12. В поисковую строку ввести запомненное значение.
 13. Найти и проверить, что наименование товара соответствует запомненному значению.
 * Created by 1 on 18.06.2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"steps"},
        plugin = {
                "util.AllureReporter",
        }
)
public class CucumberYandexMarketTV {

}

