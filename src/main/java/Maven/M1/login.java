package Maven.M1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	WebDriver driver;

	public login(WebDriver driver3) {
		driver=driver3;
	}

	public void login1()
	{
		//driver.findElement(By.xpath ("//a[text()='Sign Up Free']")).click();

		driver.findElement(By.xpath ("//a[text()='Log in']")).click();
		driver.findElement(By.id ("login-mobile")).sendKeys("9545635856");
		driver.findElement(By.id ("login-password")).sendKeys("s654321");
		driver.findElement(By.id ("sub_btn")).click();

	}


}
