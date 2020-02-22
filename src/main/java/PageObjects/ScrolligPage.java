package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ScrolligPage {

    public ScrolligPage (AppiumDriver driver ) {

        PageFactory.initElements (new AppiumFieldDecorator (driver), this );
    }

    @AndroidFindBy(className = "android.widget.Spinner")
    public WebElement ScrolligPage1;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"1995\"));")
    public WebElement ScrolligPage2;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='1995']")
    public WebElement ScrolligPage3;

   // @AndroidFindBy(uiAutomator = "(//android.widget.FrameLayout)[2]")
   // public WebElement ScrolligPage4;


    @AndroidFindBy(className =  "android.widget.Spinner")
    public WebElement ScrolligPage5;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"1995\"));")
    public WebElement ScrolligPage6;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='1995']")
    public WebElement ScrolligPage7;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"The Usual Suspects\"));")
    public WebElement ScrolligPage8;

}
