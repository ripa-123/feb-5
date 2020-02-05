package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class varifyclass {
	ChromeDriver driver;

	@BeforeTest

	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Tonmay bahi class2018\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whitecircleschool.com/");

	}

	@Test (priority =0, enabled = true)
	public void varifyvarifaction() {
		String expectedText = "White Circle Code School";
		String ActualText = driver.getTitle();
		Assert.assertEquals(ActualText, expectedText);

		// if (expectedText.equals(ActualText)) {
		// System.out.println("test case pass");
		// }
		// else {
		// System.out.println("test case fail ");

		// }
	}
		@Test (priority =1)
		
		public void verifyanotherfunc(){
			
		}

	  @Test(priority =2)
	  public void verify3() {
		  
	  }

	 @AfterTest
	 public void closeapp() {
		 driver.close();
	 }
}
