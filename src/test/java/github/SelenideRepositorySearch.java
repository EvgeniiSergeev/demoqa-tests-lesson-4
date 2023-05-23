package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @BeforeAll
    static void beforeall() {

        Configuration.browser = "firefox"; // open browser firefox
        Configuration.browserSize = "1920x1080"; // size browser
    }

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

//        открыть главную страницу
        open("https://github.com/");
//        ввести в поле поиска selenide и нажать enter
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter(); // поиск по атрибуту placeholder="Search GitHub"
//        кликнуть на первый репозиторий из списка найденных
        $$("ul.repo-list li").first().$("a").click(); // ищем все элементы ($$), выбираем первый и кликаем, если надо не первый элемент то вместо first вводим  get(нужный элемент)
//        проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

        sleep(5000);

        // Относится ко всем видам теста, состоит из 3 вещей:
        // ARRANGE подготовка
        // ACT     действие
        // ASSERT  проверка

        // .classname, #id1, [atribute] example a[href=abc].red - 3 условия



    }

}
