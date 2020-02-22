package com.test;

import PageObjects.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Utils;

import java.io.IOException;

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
        HomePage homeObject =  new  HomePage (driver); // add PageObject here
        Utils.sleep (2);
        takeScreenShot(ImageName, driver);
        homeObject.HomeList1.click ();Utils.sleep (2);
        homeObject.HomeList2.click ();
        takeScreenShot(ImageName2, driver);
    }
     @Test
    public  void HomeScrolling () throws IOException {

         String LogsName = "ScrollingList.log";
         ServerRunners(LogsName);
         AndroidDriver<AndroidElement> driver = capabilities ();Utils.sleep(2);
         HomePage homeObject =  new  HomePage (driver);
         homeObject.HomeList3.click ();
         homeObject.HomeList4.click ();
         Utils.sleep (2);

     }
    @AfterClass
    public  void Quit(){
        driver.quit ();
    }

}

