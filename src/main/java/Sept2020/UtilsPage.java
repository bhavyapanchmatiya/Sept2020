package Sept2020;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class UtilsPage extends BasePage{

    // To Enter Text
    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //To get Text from Element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //To wait for the element to load and click when its loaded
    public static void waitForClickable(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Wait for the element to load and become visible
    public static void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Wait for alert message
    public static void waitForAlertPresent(long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //To click the element
    public void clickElement(By by) {


        driver.findElement(by).click();
    }


    //to generate random date and time in ddMMyyHHmmss format
    public static String randomDateTime() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date());
    }

    // to generate random DOUBLE number
    public static double generateRandomNumberDouble(){
        double x = Math.random();
        return x;
    }

    // to generate Random Number in Date Format ddMMyy
    public static String getRandomNumberDate() {
        DateFormat format = new SimpleDateFormat("ddMMyy");
        return format.format(new Date());
    }

    // To generate random float number
    public static float generateRandomFloat() {
        Random random = new Random();
        return random.nextFloat();
    }

    // To extract text from element
    public static String extractText(By by) {
        return driver.findElement(by).getText();
    }

    //To get Attribute
    public static String getAttributeValue(By by,String text){
        return driver.findElement(by).getAttribute(text);
    }

    //To get Css Value
    public static String getCssValue(By by,String value){
        return driver.findElement(by).getCssValue(value);
    }

    // To select by visible text
    public static void selectByVisibleText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //To select by Value
    public static void selectByValue(By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
        select.getFirstSelectedOption();
    }

    // To select by Index
    public static void selectByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    // To wait
    public static void sleep(final long millis) {
        System.out.println((String.format("sleeping %d ms", millis)));
        try { Thread.sleep(millis);
        } catch (InterruptedException ex) {
            ex.printStackTrace(); }
    }

    // To get properties from from testdataConfig
    static Properties props;
    static FileInputStream inputStream;
    public static String getProperty(String key) {
        props = new Properties();
        try { inputStream = new FileInputStream("src\\test\\Resources\\TestData\\testdataConfig.properties");
            props.load(inputStream);
            inputStream.close();
        }catch (IOException e)    {
            e.printStackTrace();
        }return props.getProperty(key);
    }

    // To generate random Email
    public String generateEmail(){
        return "Bhavya.panchmatiya" + randomDateTime() + "@gmail.com";
    }

    //To make the window of browser full screen
    public void manageWindow(){
        driver.manage().window().maximize();
    }

    //To manage timeout implicity
    public void manageTimeoutImplicity(){
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
    }

    //To open Chrome version76
    public void openChromeVersion76(){
        driver = new ChromeDriver();
    }

    // To open NopCommerce
    public void openNopCommerce(){
        driver.get("https://demo.nopcommerce.com/");

    }

    // Waiting 30 seconds for an element to be present on the page, checking
    // for its presence once every 5 seconds.
    public void fluentWait(){
        Wait wait = new FluentWait(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);
    }

    public static void takeSnapShot  (String text){

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("src\\test\\Resources\\ScreenShots\\" + text + ".png"),true);
        } catch (IOException e) {
            e.printStackTrace();




        }


    }

    public static void assert_URLMethod(String text){

        String textURL = driver.getCurrentUrl();
        Assert.assertEquals(textURL,text);
        System.out.println("Expected: " + textURL + " Actual: " + text);
    }

    public void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
