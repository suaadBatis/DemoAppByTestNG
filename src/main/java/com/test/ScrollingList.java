package com.test;

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
            driver.findElementByClassName ("android.widget.Spinner").click();
            driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"1995\"));");
            driver.findElementByXPath("//android.widget.CheckedTextView[@text='1995']").click();
            Utils.sleep (2);
        }
        @Test
        public void ListOfMoviesByYear() throws MalformedURLException { String LogsName = "ListOfMoviesByYear.log";
            ServerRunners(LogsName);
            AndroidDriver<AndroidElement> driver = capabilities ();Utils.sleep(1);
            driver.findElementByClassName ("android.widget.Spinner").click();
            driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"1995\"));");
            driver.findElementByXPath("//android.widget.CheckedTextView[@text='1995']").click();
            driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"The Usual Suspects\"));");
        }
}
