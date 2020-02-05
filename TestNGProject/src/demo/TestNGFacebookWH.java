package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFacebookWH {
	ChromeDriver driver;
	
		@BeforeTest
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Tonmay bahi class2018\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
		@Test (priority =1, enabled = true)
		public void verifylogo() {
			driver.findElement(By.cssSelector("#blueBarDOMInspector > div > div > div > div.lfloat._ohe > h1")).isSelected();
			System.out.println("selected  successfully");
		}
		@Test(priority =2)
		public void rediobutton(  ) {
			driver.findElement(By.name("sex")).click();
			System.out.println("radio button click");
		}
		@ Test (priority =3, enabled = true)
		public void singup() {
			driver.findElement(By.name("websubmit")).click();
			System.out.println("successfully click");
		}
		
	@AfterTest
	public void closeapp() {
		
	}

}
