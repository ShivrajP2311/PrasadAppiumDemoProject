package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
	
	try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo Y51A");
		caps.setCapability(MobileCapabilityType.UDID, "9648794393002UR");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		
//		caps.setCapability("appPackage", "com.android.chrome");
//		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		caps.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		caps.setCapability("chromedriverExecutable","D:\\SWQA-PrasadPhalle\\chromedriver_win32\\chromedriver.exe");
		
				
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, caps);
//		driver.get("https://google.com");
		
		System.out.println("Chrome Browser Application Started..");
	
	}catch(Exception ex) {
		System.out.println(ex.getCause());
		System.out.println(ex.getMessage());
		ex.printStackTrace();
	}
	}
	
	@Test
	public void sampleTest1() {
		System.out.println("I'm inside sampleTest1() method in BaseClass.");
	}
	
	
//	@AfterSuite
//	public void teardown() {
//		driver.close();
//		driver.quit();
//		
//	}

}
