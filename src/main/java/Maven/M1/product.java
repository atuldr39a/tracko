package Maven.M1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product {

	WebDriver driver;
	public product(WebDriver driver2) {
		driver=driver2;

	}

	public void product() throws InterruptedException
	{

		Thread.sleep(10000);
	
		driver.findElement(By.xpath ("//a[text()='Products']")).click();
		//driver.findElement(By.xpath ("//a[@='Details']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath ("//a[@href='product_details.html?modelId=1'][@class='btn btn-sm btn-block btn-cta-primary']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath ("//a[@href='product_details.html?modelId=1']")).click();




	}

}
