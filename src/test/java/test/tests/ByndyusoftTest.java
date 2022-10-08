package test.tests;

import main.pages.google.GoogleMainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.base.BaseSelenideTest;

public class ByndyusoftTest extends BaseSelenideTest {

    @Test
    @DisplayName("Проверка корректности почты")
    public void checkPhoneAndEmail(){
        Assertions.assertEquals(new GoogleMainPage()
                .searchGoogle("Byndyusoft")
                .clickAboutUsBtn()
                .clickOrderPresentationBtn(), "sales@byndyusoft.com");
    }
}
