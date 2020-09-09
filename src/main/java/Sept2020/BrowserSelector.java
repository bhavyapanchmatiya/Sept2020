package Sept2020;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserSelector extends UtilsPage {

    public static final String USERNAME = getProperty("SAUCE_USERNAME");
    public static final String ACCESS_KEY = getProperty("SAUCE_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    public static final boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("Sauce"));
    public static final String browser = System.getProperty("browser");

    public void setUpBrowser()
    {
        System.out.println(USERNAME);
        System.out.println(ACCESS_KEY);
        //if sauce lab is true in TestDataConfig.properties.............................................................
        if(SAUCE_LAB)
        {
            System.out.println("Running in Saucelab...........with browser "+browser);
            if(browser.equalsIgnoreCase("chrome"))
            {
                MutableCapabilities sauceOptions = new MutableCapabilities();

                ChromeOptions caps = new ChromeOptions();
                caps.setExperimentalOption("w3c",true);
                caps.setCapability("platformName","Windows 10");
                caps.setCapability("browserVersion","77.0");
                caps.setCapability("sauce:options",sauceOptions);
                try
                {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                }
                catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            }
            else if(browser.equalsIgnoreCase("IE"))
            {
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("platform","Windows 10");
                caps.setCapability("version","11");

                try
                {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                }
                catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            }
            else if (browser.equalsIgnoreCase("firefox"))
            {
                DesiredCapabilities caps = DesiredCapabilities.firefox();
                caps.setCapability("platform","Windows 7");
                caps.setCapability("version","56");
                caps.setCapability("name","Testing on Firefox 56");
                try
                {
                    driver = new RemoteWebDriver(new URL(URL),caps);
                }
                catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            }
            else if(browser.equalsIgnoreCase("safari"))
            {
                DesiredCapabilities caps=DesiredCapabilities.safari();
                caps.setCapability("platform","os x 10.10");
                caps.setCapability("version","8.0");
                try
                {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                }
                catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            }
            else if(browser.equalsIgnoreCase("ie"))
            {
                DesiredCapabilities caps = DesiredCapabilities.edge();
                caps.setCapability("platform", "window 10");
                caps.setCapability("version", "16.16299");
                try
                {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                }
                catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("wrong browser name or empty:"+browser);
            }
        }
        else
        {
            String browser = getProperty("browser");

            if(browser.equalsIgnoreCase("chrome")){

                System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver85.exe");

                driver = new ChromeDriver();

            }else if(browser.equalsIgnoreCase("firefox")){

                System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");

                driver = new FirefoxDriver();

            }else if(browser.equalsIgnoreCase("ie")){

                System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");

                driver = new InternetExplorerDriver();


            }else
            {
                System.out.println("wrong browser name or empty:"+browser);
            }
        }
    }












}
