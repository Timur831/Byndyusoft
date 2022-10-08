package main.pages.byndyusoft;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class ByndyusoftHeader {
    private final SelenideElement ABOUT_US_BTN = $x("//a[text()='О нас']");

    public ByndyusoftAboutUsPage clickAboutUsBtn(){
        switchTo().window(1);
        ABOUT_US_BTN.shouldBe(Condition.visible).click();
        return new ByndyusoftAboutUsPage();
    }
}
