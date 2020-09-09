package Sept2020;

import org.openqa.selenium.By;

public class HomePage extends UtilsPage {

    private By _clickRegisterLink = By.className("ico-register");
    private By _clickBuildYourOwnComputer = By.xpath("//a[@href=\"/build-your-own-computer\"]");





    public void verifyUserIsOnHomePage(){

        assert_URLMethod("https://demo.nopcommerce.com/");
    }

    public void clickOnRegister(){

        clickElement(_clickRegisterLink);
    }

    public void clickOnBuildYourOwnComputer(){


        pause(2000);
        clickElement(_clickBuildYourOwnComputer);
        pause(1000);
    }


}
