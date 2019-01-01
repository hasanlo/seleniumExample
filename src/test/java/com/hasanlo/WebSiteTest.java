package com.hasanlo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class WebSiteTest {
    private static WebDriver browser;

    @BeforeClass
    public static void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://hasanlo.com");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        browser.close();
    }

    @Test
    public void testHeader() {
        WebElement header = browser.findElement(By.xpath("//*[@id=\"Part1\"]/div[2]/div[2]/h1"));
        assertEquals("میلاد حاجی حسنلو - برنامه نویس", header.getText());
    }

    @Test
    public void testPath() {
        assertEquals("https://hasanlo.com/", browser.getCurrentUrl());
    }
}
