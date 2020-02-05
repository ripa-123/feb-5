package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class linkedin {
	ChromeDriver driver;

	@BeforeTest
	public void initialwork() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Tonmay bahi class2018\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)

	public void method1() {
		driver.findElementByLinkText("Join now").click();
		System.out.println("join click");
	}

	@Test(priority = 2)
	public void method2() {
		driver.findElement(By.name("email-address")).sendKeys("AA#@gmail.com");
	}

	@Test(priority = 0)
	public void method3() {
		driver.findElement(By.id("password")).sendKeys("AAA##");
	}

	@afterTest
	public void closeapp() {
		driver.close();

	}

}
