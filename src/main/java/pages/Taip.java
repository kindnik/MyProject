package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Taip extends DriverWeb {

    //Данный универсальный метод позволяет заполнять поля форм "Свяжитесь с нами"

    public Taip заполнять_поля_форм(String name, String mail, String messege) {
        WebElement полеИмя = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap your-name']//input"));
        WebElement полеMail = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap your-email']//input"));
        WebElement полеMessege = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap your-message']//textarea"));


        Assertions.assertEquals("Ваше имя*", полеИмя.getAttribute("placeholder")
                , "Текст в поле некорректно заполнен!");

        Assertions.assertEquals("Ваш Email*", полеMail.getAttribute("placeholder")
                , "Текст в поле некорректно заполнен!");

        полеИмя.sendKeys(name);
        полеMail.sendKeys(mail);
        полеMessege.sendKeys(messege);
//
//        Assertions.assertEquals(name, полеИмя.getText(), "Текст в поле некорректно заполнен!");
//        Assertions.assertEquals(mail, полеMail.getText(), "Текст в поле некорректно заполнен!");
//        Assertions.assertEquals(messege, полеMessege.getText(), "Текст в поле некорректно заполнен!");

        return this;
    }

    // Данный метод переходит на страницу "о компании"

    public AboutCompany нажать_о_компании() {
        WebElement требуемая_вкладка = driver.findElement(By.id("menu-item-38"));
        требуемая_вкладка.click();
        return new AboutCompany();
    }
}





