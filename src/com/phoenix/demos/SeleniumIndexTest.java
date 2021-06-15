package com.phoenix.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumIndexTest {

	public static void main(String[] args) {
		
		//for chrome webdriver.chrome.driver -> chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\clutter\\edac\\se\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//rama@gmail.com
		//ram#123
//		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:7070/day15spring-mvc-boot2/user/login");
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("rama@gmail.com");
		WebElement txtPass  = driver.findElement(By.name("password"));
		txtPass.sendKeys("ram#123");
		WebElement submit  = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		List<WebElement> test = driver.findElements(By.tagName("tr"));
		System.out.println(test.size());
//		Assert.assertFalse("error, unequal size", test.size() != 7);
//		Assert.assertEquals(8, test.size());
		
//		WebElement submit  = driver.findElement(By
		
		
		
		
		//		WebElement txt1=driver.findElement(By.id("user"));
//		txt1.sendKeys("Chetan");
//		WebElement submit=driver.findElement(By.xpath("//div[@id='subform']//input[@type='submit']"));
//		submit.click();
		//Get the web element representing the check box.
		//Click on it to turn it on
		//Get the web element representing the partner's name
		//use Assert.assertFalse(driver.findElement(By.xpath(//input[@id='partner'])).isEnabled());
//		System.out.println(submit);
		/*
		 * driver.get("http://localhost:8081/LoginApp/index.html"); WebElement
		 * user=driver.findElement(By.id("user")); user.sendKeys("Chetan");
		 * 
		 * WebElement pass=driver.findElement(By.name("password"));
		 * pass.sendKeys("123456");
		 * 
		 * WebElement submit=driver.findElement(By.xpath(
		 * "//div[@id='subform']//input[@type='submit']"));
		 */
		//System.out.println(submit.getText());
		
		/*
		 * WebElement link=driver.findElement(By.partialLinkText("Log")); link.click();
		 */
		
		//submit.click();
		//System.out.println(user.toString());
		//clear, click, isEnabled, isDisplayed, isSelected, getLocation, getSize
	}

}
