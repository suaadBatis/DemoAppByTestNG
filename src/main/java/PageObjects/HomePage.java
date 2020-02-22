package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    public HomePage (AppiumDriver  driver ) {

        PageFactory.initElements(new AppiumFieldDecorator (driver), this ); // to invoke driver
    }

   @AndroidFindBy(xpath = "(//android.widget.FrameLayout)[1]")
   public  WebElement HomeList1;

    @AndroidFindBy(className = "android.widget.ImageButton")
    public  WebElement HomeList2;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Ant-Man and the Wasp\"));")
    public  WebElement HomeList3;

    @AndroidFindBy(xpath = "(//android.widget.FrameLayout)[2]")
    public  WebElement HomeList4;

}
