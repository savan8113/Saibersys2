package com.test.basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UICatalog {

	
	public static void main(String args[]) throws MalformedURLException
	{
		
		File source= new File("/Users/Savanth/Library/Developer/Xcode/DerivedData/UICatalog-ehrosvkahqrpeyfjympynvirjvza/Build/Products/Debug-iphonesimulator/UICatalog.app");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		
		cap.setCapability(MobileCapabilityType.APP, "settings");
		
		IOSDriver driver= new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
	}
}
