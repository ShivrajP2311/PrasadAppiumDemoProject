package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ChromeTest extends BaseClass{
	
	@Test(priority= -1)
	public void testOne() throws InterruptedException {

//		driver.get("https://google.com");
		driver.get("https://www.swqa-solutions.com/about-us/");
//		driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("SWQA Solutions");
//		driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys(Keys.ENTER);
		
//		driver.findElement(By.className("android.widget.EditText")).sendKeys("SWQA Solutions");
//		driver.findElement(By.className("android.widget.EditText")).sendKeys(Keys.ENTER);
				
//		driver.findElement(By.name("q")).sendKeys("SWQA");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		System.out.println("Completed Test One..");
		
	}
	
	@Test
	public void orangeHRMLoginTest() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
/*

	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
*/

		System.out.println("Completed Test Two..");
	}

}
