package main.pages.byndyusoft;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ByndyusoftAboutUsPage {
    private final SelenideElement ORDER_PRESENTATION_BTN = $x("//span[text()='Заказать презентацию']");
    private final SelenideElement EMAIL_REF = $x("//div[@class= 'popup-callback__footer']/div[1]/a");

    public String clickOrderPresentationBtn(){
        ORDER_PRESENTATION_BTN.shouldBe(Condition.visible).click();
        return EMAIL_REF.text();
    }
}
