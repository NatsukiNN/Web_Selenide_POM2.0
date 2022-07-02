package cucumber.stepDefs;

import cucumber.pages.CartPage;
import cucumber.pages.CheckoutPage;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class CheckoutStep {

    CheckoutPage checkoutPage = page(CheckoutPage.class);

    @When("I set order information")
    public void iSetOrderInformation(){
        checkoutPage.cashOnDeliveryRadioButton.click();
    }
    @When("I click on Place Order button")
    public void iClickOnPlaceOrderButton(){
        checkoutPage.placeOrderButton.click();
    }


}
