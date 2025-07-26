package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EasyCalculationTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easycalculation.com/");
    }

    @Test
    public void searchEasyCalculation() throws InterruptedException {

        driver.findElement(By.id("calcSearchBtn")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("searchInput")).sendKeys("easy calculation");
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='search-result']//a)[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("searchInput")).sendKeys("Bangalore");
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='search-result']//a)[1]")).click();
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
