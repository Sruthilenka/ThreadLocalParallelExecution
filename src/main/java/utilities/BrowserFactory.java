package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    //instance variable
    private static BrowserFactory instance;

    //ThreadLocal
    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    //private constructor
    private BrowserFactory(){

    }

    public static BrowserFactory getInstance(){
        if(instance==null){
            instance = new BrowserFactory();
        }
        return instance;
    }

    //SetDriver
    public final void setDriver(String browser) {

        DesiredCapabilities caps = null;

        switch(browser){
            case "chrome":
               /* caps= DesiredCapabilities.chrome();
                ChromeOptioms chOptions = new ChromeOptions();
                Map<String,Object> chromePrefs = new HashMap<String,Object>();
                chromePrefs.put("credentials_enable_service",false);
                chOptions.setExperimentalOption("prefs",chromePrefs);
                chOptions.addArguments("--disable-plugins","--disable-extensions", "--disable-popup-blocking");
                        caps. setCapability(ChromeOptions.CAPABILITY,chOptions);
                        caps.setCapability("applicationCacheEnabled", false);*/
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
        }
    }

    //getDriver
    public WebDriver getDriver(){
        return driver.get();
    }

}
