package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGvarifyHW {
	
	ChromeDriver driver;
	@BeforeTest
	
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Tonmay bahi class2018\\chromedriver_win32\\chromedriver.exe");
	
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void enterusername() {
		driver.findElement(By.id("email")).sendKeys("fff@gmail.com");
	}
	@Test
	public void password() {
	driver.findElement(By.id("pass")).sendKeys(" A2321C");	
	
	}
	
	@ Test
	public void login() {
	driver.findElement(By.id("loginbutton")).click();	
	}
	@AfterTest
	public void closeapp() {
	driver.close();	
	}
	

}
