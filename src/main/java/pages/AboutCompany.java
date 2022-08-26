package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.page;

public class AboutCompany extends DriverWeb {
//    private static Logger log = LoggerFactory.getLogger(AboutCompany.class);
//    static AboutCompany instance;
//
//    public static AboutCompany getInstance() {
//        return page(instance != null ? instance : new AboutCompany());
//    }
//
//    //konstructor
//    public AboutCompany() {
//        //waitUntilFrameIsActive("");
//        instance = this;
//    }


    /**
     * Метод для проверки теста
     */
    public AboutCompany проверка_текста(String ожидаемый_текст) {
        WebElement текст = driver.findElement(By.xpath("//p[@style='text-align: center;']"));
        Assertions.assertEquals(ожидаемый_текст, текст.getText(),"Текст не совпадает");
        return this;
    }

    /**
     * Данный метод переходит на страницу "контакты"
     */
    public Contact нажать_контакты () {
        WebElement требуемая_вкладка_контакты = driver.findElement(By.id("menu-item-43"));
        требуемая_вкладка_контакты.click();
        return new Contact();
    }

}
