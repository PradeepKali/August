package com.mnb;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Asst {
	
	//Assert or HardAssert
	
	public static WebDriver driver;
	
@BeforeClass
	
	public static void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADVENTURES200\\eclipse-workspace\\MavenPractice\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://www.facebook.com";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	@Before
	
	public void start() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	
	public void end() {
		Date d = new Date();
		System.out.println(d);
	}
	

	@Test
	public void test1() {
    Assert.assertTrue(driver.getCurrentUrl().contains("https"));
	WebElement user = driver.findElement(By.id("email"));	
	user.sendKeys("pradeep");
	}
	

	@Test
	public void test2() {
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("12345");
	Assert.assertEquals(password.getAttribute("value"), "12345");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	}

}
