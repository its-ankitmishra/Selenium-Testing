package com.SeleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANMISHMI\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.half.ebay.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource().length());

        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        driver.quit();
    }
}
