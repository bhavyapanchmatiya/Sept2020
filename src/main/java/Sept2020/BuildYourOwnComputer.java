package Sept2020;

import org.openqa.selenium.By;


public class BuildYourOwnComputer extends UtilsPage{



    private By _selectRadioButton = By.id("product_attribute_3_6");
    private By _clickAddToCart = By.id("add-to-cart-button-1");
    private By _clickShoppingCartLink = By.id("topcartlink");



public void verifyUSerIsOnComputerPage(){

    assert_URLMethod("https://demo.nopcommerce.com/build-your-own-computer");


}

public void addToCart(){

    clickElement(_selectRadioButton);
    pause(1000);
    clickElement(_clickAddToCart);
    clickElement(_clickShoppingCartLink);


}




}