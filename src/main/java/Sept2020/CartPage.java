package Sept2020;

import org.openqa.selenium.By;

public class CartPage extends UtilsPage{

    private By _selectTermsAndCondition = By.id("termsofservice");
    private By _clickCheckoutButton = By.id("checkout");



    public void verifyUserIsOnCartPage(){

        assert_URLMethod("https://demo.nopcommerce.com/cart");

    }

    public void selectTermsAndConditionsAndCheckout(){
        pause(1000);
        clickElement(_selectTermsAndCondition);
        clickElement(_clickCheckoutButton);


    }

}
