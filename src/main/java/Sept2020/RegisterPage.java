package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends UtilsPage{


    private By _enterFirstName = By.id("FirstName");
    private By _enterLastName = By.id("LastName");
    private By _enterEmail = By.id("Email");
    private By _enterPassword = By.id("Password");
    private By _enterConfirmPassword = By.id("ConfirmPassword");
    private By _clickContinueButton = By.xpath("//input[@class=\"button-1 register-continue-button\"]");
    private By _clickRegisterButton = By.id("register-button");
    private By _registrationMessage = By.xpath("//div[@class=\"result\"]");



    public void userShouldBeAbleToRegisterSuccessfully(){


        enterText(_enterFirstName,getProperty("FirstName"));
        enterText(_enterLastName,getProperty("LastName"));
        enterText(_enterEmail,getProperty("FirstName")+randomDateTime()+getProperty("Email"));
        enterText(_enterPassword,getProperty("PassWord"));
        enterText(_enterConfirmPassword,getProperty("PassWord"));
        clickElement(_clickRegisterButton);

    }

    public void verifyUserIsRegistered(){

        String actualResult = extractText(_registrationMessage);
        String expectedResult = "Your registration completed";
        Assert.assertEquals(actualResult,expectedResult);
    }

    public void clickContinueButton(){
        pause(1000);

        clickElement(_clickContinueButton);
    }
}
