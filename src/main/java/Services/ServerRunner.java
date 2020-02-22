package Services;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.AfterClass;
import java.io.File;


public class ServerRunner {

    public  static AppiumDriverLocalService service;
    public  static  String Logsname; // should be name.log
    public static  void ServerRunners(String Logsname) throws NullPointerException {

        service = AppiumDriverLocalService.buildService (
                new AppiumServiceBuilder ().usingDriverExecutable(new File ("/usr/local/bin/node"))
                        .withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
                        .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                        .withIPAddress("127.0.0.1").usingAnyFreePort()
                        .withLogFile(new File (System.getProperty("user.dir")+"/src/test/resources/Logs/"+Logsname)));
        service.start();

    }

    @AfterClass
    public static void StopServer () throws NullPointerException
    {
        service.stop(); // check the logs folder
    }


}
