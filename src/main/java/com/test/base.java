package com.test;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base{
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "/app/app-release.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities ();
        desiredCapabilities.setCapability ("platformName", "android");
        //emulator
        //desiredCapabilities.setCapability ("deviceName", "emulator-5554");
        //desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        desiredCapabilities.setCapability ("platformVersion", "9.0");
        desiredCapabilities.setCapability ("deviceName", "Suaad");
        desiredCapabilities.setCapability ("app", app.getAbsolutePath ());
        desiredCapabilities.setCapability( MobileCapabilityType.TAKES_SCREENSHOT, "true");
        URL remoteUrl = new URL ("http://localhost:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver (remoteUrl, desiredCapabilities);
        return driver; // super variable
    }
}