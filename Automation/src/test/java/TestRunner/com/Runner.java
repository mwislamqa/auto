package TestRunner.com;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utils.Common;

import Base.com.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.com.HomePage;

public class Runner extends Base{
	public HomePage hm;

	
	 public Runner(){ 
		  super(); 
		  }
	//@Parameters("Browser") 
	@BeforeTest
	public void setup() {

	initialize();//google.
		
		hm= new HomePage();
		
	}@Test(priority=1)
	public void titelTest() throws IOException {
		String tt=hm.logopageTitle();
		Assert.assertEquals(tt, "Google");
		//Common.takeScreenshot();
		
	}
	@Test(priority=2)
	public void input() throws IOException {
		hm.search();
		Common.takeScreenshot();
		
		 // Assert.assertTrue(true);
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
