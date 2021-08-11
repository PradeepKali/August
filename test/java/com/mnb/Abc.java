package com.mnb;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

	//junit 1st part
	
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
	@AfterClass
	public static void end1() {
	driver.quit();	
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
	public void test() {
	WebElement user = driver.findElement(By.id("email"));	
	user.sendKeys("pradeep");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("12345");
    }
	
	@Test
	public void test1() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	
}
