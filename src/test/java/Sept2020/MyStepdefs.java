package Sept2020;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {


    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("^User should be able to complete registration successfully$")
    public void userShouldBeAbleToCompleteRegistrationSuccessfully() {

        homePage.verifyUserIsOnHomePage();
        homePage.clickOnRegister();
        registerPage.userShouldBeAbleToRegisterSuccessfully();
        registerPage.verifyUserIsRegistered();
        registerPage.clickContinueButton();


    }

    @When("^User selects the product$")
    public void userSelectsTheProduct() {

        homePage.verifyUserIsOnHomePage();
        homePage.clickOnBuildYourOwnComputer();
        buildYourOwnComputer.verifyUSerIsOnComputerPage();
        buildYourOwnComputer.addToCart();
        cartPage.verifyUserIsOnCartPage();
        cartPage.selectTermsAndConditionsAndCheckout();





    }

    @And("^User fill in the payment details$")
    public void userFillInThePaymentDetails() {

        checkoutPage.verifyUserIsOnCheckoutPage();
        checkoutPage.enterShippingDetailsWithoutName();


    }

    @Then("^User should see the confirmation message$")
    public void userShouldSeeTheConfirmationMessage() {
        checkoutPage.verifyConfirmationMessage();
    }

    @And("^click continue as guest\\.$")
    public void clickContinueAsGuest() {
        checkoutPage.checkoutAsGuest();
    }

    @When("^User fill in the payment details with name$")
    public void userFillInThePaymentDetailsWithName() {

        checkoutPage.enterShippingDetailsWithName();
    }
}
