package cucumber.stepDefs;

import cucumber.pages.ProductPage;
import cucumber.pages.StorePage;
import cucumber.pages.TopBarMenu;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class ProductStep {

    ProductPage productPage = page(ProductPage.class);
    TopBarMenu topBarMenu = page(TopBarMenu.class);

    @When("I add product into my cart")
    public void iAddProductIntoMyCart() {
        productPage.quantityInput.val("1");
        productPage.addToCartButton.click();
    }
    @When("I click cart icon")
    public void iClickCartButton() {
        topBarMenu.cartMenu.click();
    }

}
