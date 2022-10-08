package main.pages.google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import main.pages.byndyusoft.ByndyusoftHeader;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class GoogleMainPage {
    private final SelenideElement GOOGLE_SEARCH_INPUT = $x("//*[@title='Поиск']");
    private final SelenideElement FIRST_RESULT = $x("//*[@id='res']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a");

    public GoogleMainPage(){
        open("https://www.google.ru/");
    }

    public ByndyusoftHeader searchGoogle(String string){
        GOOGLE_SEARCH_INPUT.shouldBe(Condition.visible).sendKeys(string, Keys.ENTER);
        FIRST_RESULT.shouldBe(Condition.visible).click();
        return new ByndyusoftHeader();
    }
}
