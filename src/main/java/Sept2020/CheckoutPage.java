package Sept2020;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CheckoutPage extends UtilsPage{

    private By _enterCountry = By.id("BillingNewAddress_CountryId");
    private By _enterCity = By.id("BillingNewAddress_City");
    private By _enterAddress = By.id("BillingNewAddress_Address1");
    private By _enterPostCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _enterPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _clickContinueButtonOne = By.xpath("//input[@class=\"button-1 new-address-next-step-button\"]");
    private By _clickContinueButtonTwo = By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    private By _selectCreditCardButton = By.id("paymentmethod_1");
    private By _clickConitnueButtonThree = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    private By _selectCreditCardScrollDowm = By.id("CreditCardType");
    private By _enterCardHolderName = By.id("CardholderName");
    private By _enterCardNumber = By.id("CardNumber");
    private By _enterExpiryMonth = By.id("ExpireMonth");
    private By _enterExpireYear = By.id("ExpireYear");
    private By _enterCardCode = By.id("CardCode");
    private By _clickContinueButtonFour = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _confirmButton = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");
    private By _acutualMessage = By.xpath("//div[@class=\"page-title\"]");
    private By _checkoutAsGuest = By.xpath("//input[@value=\"Checkout as Guest\"]");
    private By _firstNameCheckout = By.id("BillingNewAddress_FirstName");
    private By _lastNameCheckout = By.id("BillingNewAddress_LastName");
    private By _emailCheckout = By.id("BillingNewAddress_Email");
    SoftAssert softAssert = new SoftAssert();







    public void verifyUserIsOnCheckoutPage(){

        assert_URLMethod("https://demo.nopcommerce.com/onepagecheckout#opc-billing");
    }

    public void enterShippingDetailsWithoutName(){

        selectByValue(_enterCountry,"133");
        enterText(_enterCity,getProperty("City"));
        enterText(_enterAddress,getProperty("Address"));
        enterText(_enterPostCode,getProperty("PostCode"));
        enterText(_enterPhoneNumber,getProperty("Phone"));
        clickElement(_clickContinueButtonOne);
        clickElement(_clickContinueButtonTwo);
        clickElement(_selectCreditCardButton);
        clickElement(_clickConitnueButtonThree);
        selectByValue(_selectCreditCardScrollDowm,"MasterCard");
        enterText(_enterCardHolderName,getProperty("CardHolderName"));
        enterText(_enterCardNumber,getProperty("CardNumber"));
        selectByIndex(_enterExpiryMonth,5);
        selectByValue(_enterExpireYear,"2026");
        enterText(_enterCardCode,getProperty("CardCode"));
        clickElement(_clickContinueButtonFour);
        clickElement(_confirmButton);


    }

    public void verifyConfirmationMessage(){

        //assert_URLMethod("https://demo.nopcommerce.com/checkout/completed/");


        String actual = extractText(_acutualMessage);
        String expected = "Checkout";

        System.out.println(actual);


        Assert.assertEquals(actual,expected);
    }

    public void checkoutAsGuest(){
        pause(1000);
        clickElement(_checkoutAsGuest);
        pause(1000);
    }

    public void enterShippingDetailsWithName(){

        enterText(_firstNameCheckout,getProperty("FirstName"));
        enterText(_lastNameCheckout,getProperty("LastName"));
        enterText(_emailCheckout,getProperty("FirstName")+ getRandomNumberDate()+ getProperty("Email"));
        selectByValue(_enterCountry,"133");
        enterText(_enterCity,getProperty("City"));
        enterText(_enterAddress,getProperty("Address"));
        enterText(_enterPostCode,getProperty("PostCode"));
        enterText(_enterPhoneNumber,getProperty("Phone"));
        clickElement(_clickContinueButtonOne);
        clickElement(_clickContinueButtonTwo);
        clickElement(_selectCreditCardButton);
        clickElement(_clickConitnueButtonThree);
        selectByValue(_selectCreditCardScrollDowm,"MasterCard");
        enterText(_enterCardHolderName,getProperty("CardHolderName"));
        enterText(_enterCardNumber,getProperty("CardNumber"));
        selectByIndex(_enterExpiryMonth,5);
        selectByValue(_enterExpireYear,"2026");
        enterText(_enterCardCode,getProperty("CardCode"));
        clickElement(_clickContinueButtonFour);
        clickElement(_confirmButton);

    }


}
