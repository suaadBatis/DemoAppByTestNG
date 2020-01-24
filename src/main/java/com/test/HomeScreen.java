package com.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import utils.Utils;

import java.io.IOException;
import java.net.MalformedURLException;

import static Services.ScreenShot.takeScreenShot;
import static Services.ServerRunner.ServerRunners;

public class HomeScreen extends base {

    @Test
    public  void HomeList ()throws IOException {
        String LogsName = "HomeScreen.log";
        String ImageName = "list";
        String ImageName2 = "lastimge";
        ServerRunners ( LogsName );
        AndroidDriver<AndroidElement> driver = capabilities();
        Utils.sleep (2);
        takeScreenShot(ImageName, driver);
        driver.findElementByXPath("(//android.widget.FrameLayout)[1]").click();
        driver.findElementByClassName("android.widget.ImageButton").click();
        takeScreenShot(ImageName2, driver);
    }
     @Test
    public  void HomeScrolling () throws IOException {
         String LogsName = "ScrollingList.log";
         ServerRunners(LogsName);
         AndroidDriver<AndroidElement> driver = capabilities ();Utils.sleep(2);
         driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Ant-Man and the Wasp\"));");
         driver.findElementByXPath ( "(//android.widget.FrameLayout)[2]").click ();
         Utils.sleep (2);
     }
     @Test
    public void Stop() throws MalformedURLException {
         AndroidDriver<AndroidElement> driver = capabilities ();Utils.sleep(2);
         driver.quit ();
     }






}

