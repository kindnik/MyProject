package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact extends DriverWeb {

    /**
     * Данный универсальный метод позволяет заполнять поля форм "Свяжитесь с нами"
     */
    public Contact заполнять_поля_форм_Contact(String name, String mail) {


        WebElement поле_имя_contact = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap your-name']//input"));
        WebElement поле_mail_contact = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap your-email']//input"));


        Assertions.assertEquals("Ваше имя*", поле_имя_contact.getAttribute("placeholder")
                , "Текст в поле некорректно заполнен!");

        Assertions.assertEquals("Ваш Email*", поле_mail_contact.getAttribute("placeholder")
                , "Текст в поле некорректно заполнен!");

        поле_имя_contact.sendKeys(name);
        поле_mail_contact.sendKeys(mail);

        return this;
    }


    /**
     * Метод для проверки факса и телефона
     */


    public Contact проверка_текста_факса_телефона(String ожидаемый_текст) {
        WebElement текст_факса_телефона = driver.findElement(By.xpath("//div[@class='contacts-text-cont']"));

        Assertions.assertEquals(ожидаемый_текст, текст_факса_телефона.getText(), "телефон и факс совпали");
        return new Contact();
    }
}
