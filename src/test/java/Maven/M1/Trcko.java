package Maven.M1;

import java.awt.Window;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Trcko {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		Signup ref = new Signup(driver);
		//ref.test();

		login ref1= new login(driver);
		ref1.login1();

		product ref2= new product(driver);
		ref2.product();
	}



	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe" );
		driver=  new ChromeDriver();
		driver.get("https://dev.tracko.co.in/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() 
	{

	}

}
