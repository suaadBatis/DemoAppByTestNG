package com.test;

import PageObjects.ScrolligPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import utils.Utils;

import java.io.IOException;
import java.net.MalformedURLException;

import static Services.ServerRunner.ServerRunners;


public class ScrollingList extends base {



        @Test
        public void HistoryList() throws IOException {
            String LogsName = "ScrollingList.log";
            ServerRunners(LogsName);
            AndroidDriver<AndroidElement> driver = capabilities ();Utils.sleep(1);
            ScrolligPage ScrolObject = new ScrolligPage (driver); // ObjectPage
            ScrolObject.ScrolligPage1.click ();
            ScrolObject.ScrolligPage2.click ();
            ScrolObject.ScrolligPage3.click (); Utils.sleep (2);
        }
        @Test
        public void ListOfMoviesByYear() throws MalformedURLException { String LogsName = "ListOfMoviesByYear.log";
            ServerRunners(LogsName);
            AndroidDriver<AndroidElement> driver = capabilities ();Utils.sleep(1);
            ScrolligPage ScrolObject = new ScrolligPage (driver); // ObjectPage
            ScrolObject.ScrolligPage5.click ();
            ScrolObject.ScrolligPage6.isDisplayed ();
            ScrolObject.ScrolligPage7.click ();
            ScrolObject.ScrolligPage8.isDisplayed ();

           // driver.findElementByClassName ("android.widget.Spinner").click();
            //driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"1995\"));");
            //driver.findElementByXPath("//android.widget.CheckedTextView[@text='1995']").click();
            //driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"The Usual Suspects\"));");
        }
}
