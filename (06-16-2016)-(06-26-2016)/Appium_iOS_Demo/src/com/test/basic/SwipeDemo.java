package com.test.basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeDemo {

	@Test
	public void iOSPhotoSwipe() throws MalformedURLException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		
//		cap.setCapability(MobileCapabilityType.APP, "calendar");
		
		IOSDriver driver= new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.get("http://www.cricbuzz.com");
		
		System.out.println(driver.findElementByXPath(".//*[@id='top']/div[1]/div[5]/a[1]/div/div/div/span[2]").getText());
//		driver.switchTo().alert().accept();
		

	}
}
