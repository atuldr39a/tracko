package Maven.M1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup 
{
   WebDriver driver;
   
	public Signup(WebDriver driver2) {
	driver=driver2;
}

	public void test() throws InterruptedException
	{
		
				
		driver.findElement(By.xpath ("//a[text()='Sign Up Free']")).click();
		driver.findElement(By.id ("name")).sendKeys("atul");
		driver.findElement(By.id ("email")).sendKeys("dhj8ff4hd@gmail.com");
		driver.findElement(By.id ("mobile")).sendKeys("8005088377");
		driver.findElement(By.id ("sub_btn_signup")).click();
		Thread.sleep(10000);
		driver.findElement(By.id ("otp")).sendKeys("123456");
		driver.findElement(By.id ("sub_btn_verify")).click();
		driver.findElement(By.xpath ("//button[text()='OK']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id ("password")).sendKeys("123at");
		driver.findElement(By.id ("repassword")).sendKeys("123at");
		driver.findElement(By.id ("sub_btn_setpass")).click();
		Thread.sleep(10000);

	}
}
