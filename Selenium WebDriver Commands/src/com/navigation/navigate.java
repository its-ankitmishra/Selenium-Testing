package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigate {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		String Url =driver.getCurrentUrl();
		System.out.println(Url);
	}
}
