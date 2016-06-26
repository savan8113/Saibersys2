package com.test.SauceLabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SauceLabsDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("platformName", "iOS");
		
		cap.setCapability("platformVersion", "9.3");
		
		cap.setCapability("appiumVersion", "1.5.3");
		
		cap.setCapability("deviceName", "iPhone Simulator");
		
		cap.setCapability("browserName", "");
		
		cap.setCapability("app", "sauce-storage:MyApp.zip");
		
		IOSDriver driver= new IOSDriver(new URL("http://savan8113:4e8cc5d5-6f43-4a75-bf43-50bd883d30ae@ondemand.saucelabs.com:80/wd/hub"), cap);
		
		driver.get("http://google.com");
		
		Thread.sleep(5000);
		
		
	}

}
