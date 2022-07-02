package cucumber.stepDefs;

import cucumber.pages.CartPage;
import cucumber.pages.ProductPage;
import cucumber.pages.TopBarMenu;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class CartStep {

    CartPage cartPage = page(CartPage.class);

    @When("I click on checkout button")
    public void iClickOnCheckoutButton() {
        cartPage.checkoutButtonLink.click();
    }

}
