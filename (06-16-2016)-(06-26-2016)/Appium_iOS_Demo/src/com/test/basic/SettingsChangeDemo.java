package com.test.basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SettingsChangeDemo {

	static IOSDriver driver;
	
	@Test
	public void instantiation() throws MalformedURLException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		
		cap.setCapability(MobileCapabilityType.APP, "settings");
		
		 driver= new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.findElementByClassName("UIATableCell").click();
		
		driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]").click();
		
		System.out.println(driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]/UIASwitch[1]").isEnabled());
		
		
		
		
	}
	
}
