import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class github_SolutionsTest {

    @BeforeAll
    static void basicSettingBrowder() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void GithubSolutionsTest() {
        // открыть страницу github
        open("/");
        // навести на solutions
        $("header").$(byText("Solutions")).hover();
        // выбрать Enterprises
        $("a[href='https://github.com/enterprise']").click();
        // убедиться, что открылась нужная страница например The AI-powered developer platform
        $("h#1hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}
