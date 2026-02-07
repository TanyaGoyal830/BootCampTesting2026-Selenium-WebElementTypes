package com.WEbElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementDemo {
	WebDriver driver;
	@Test
	public void IDTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mybookings.easemytrip.com/");
		WebElement username = driver.findElement(By.id("txtEmailNew"));
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());
		System.out.println(username.isSelected());
		System.out.println(username.getTagName());
		
		username.sendKeys("tanyagoyal830@gmail.com");
		driver.findElement(By.xpath("//input[@id='shwotp']")).click();
		
	}

}
