package pageobjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class ParallelDemo2 {
    @Test
    public void google(){
        //instance of BrowserFactory
        BrowserFactory browserFactory = BrowserFactory.getInstance();

        //set driver
        browserFactory.setDriver("chrome");

        browserFactory.getDriver().get("http://www.google.com");
        browserFactory.getDriver().findElement(By.name("q")).sendKeys("Selenium");

        //quit browser
      //  browserFactory.getDriver().quit();
    }
    @Test
    public void google2(){
        //instance of BrowserFactory
        BrowserFactory browserFactory = BrowserFactory.getInstance();

        //set driver
        browserFactory.setDriver("chrome");

        browserFactory.getDriver().get("http://www.google.com");
        browserFactory.getDriver().findElement(By.name("q")).sendKeys("Selenium");

        //quit browser
        browserFactory.getDriver().quit();
    }
}
