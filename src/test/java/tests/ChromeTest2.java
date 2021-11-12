package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ChromeTest2 extends BaseClass{
	
	@Test
	public void gitGithubYoutubeVideo() throws InterruptedException {

		driver.get("https://www.youtube.com/watch?v=HCeBd5GKNO8&t=29s");

		Thread.sleep(1000);
		
		System.out.println("Completed Test for git & github YouTube video..");
		
	}
	
}
