package com.webapplication.webtest1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class amazon {
		private WebDriver driver;
		@Test(priority = 0)
		public void testJbkTitle() {
			driver.get("https://www.nykaa.com/");
			String title = driver.getTitle();
			System.out.println(title);
			//Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			// driver.manage().window().setPosition(new Point(100,30));
		}
		@Test(priority = 1)
		public void testJbkTitleInvalid() {
			driver.manage().window().maximize();			
			WebElement category = driver.findElement(By.xpath("//*[@id=\"category\"]"));
			category.click();
		}
		@Test(priority = 2)
		public void testJbkTitlescroll() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(3000);			
			js.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(3000);
		}
		@Test(priority = 2)
		public void testJbkTitlesubmit() {
			WebElement account = driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]"));
			account.click();
		}
		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		@AfterTest
		public void afterTest() {
			driver.quit();
		}
	}

