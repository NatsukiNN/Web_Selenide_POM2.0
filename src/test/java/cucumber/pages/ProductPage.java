package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://askomdch.com/product/blue-shoes/
public class ProductPage {
    public SelenideElement quantityInput = $(byName("quantity"));

    public SelenideElement addToCartButton = $(byName("add-to-cart"));

    public SelenideElement viewCartButton = $(byText("View cart"));


    

    // No page elements added
}