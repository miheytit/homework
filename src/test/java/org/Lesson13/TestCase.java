package org.Lesson13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\Users\\Титовы\\IdeaProjects\\lesson12\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vc.ru/contacts");
    }

    @Test
    public void ismailButtonDisplayed() {
        WebElement mailButton = driver.findElement(By.xpath("//a[contains(text(), 'support@vc.ru')]"));
        String btnText = null;
        if (mailButton.isDisplayed()) btnText = mailButton.getText();

        assertEquals("support@vc.ru", btnText);
        System.out.println(btnText);
    }

    @Test
    public void isContactsDisplayed() {
        WebElement contactButton = driver.findElement(By.xpath("//span[contains(text(),\"Контакты\")and @class =\"commercial-list__name\"]"));
        String btnText = null;
        if (contactButton.isDisplayed()) btnText = contactButton.getText();
        assertEquals("Контакты", btnText);
        System.out.println(btnText);
    }

    @AfterAll
    public static void tearDown() {

        driver.quit();
    }
}


