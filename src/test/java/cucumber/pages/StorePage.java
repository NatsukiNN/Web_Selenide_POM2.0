package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://askomdch.com/store/
public class StorePage {
    public SelenideElement searchInput = $("#woocommerce-product-search-field-0" );

    public SelenideElement searchButton = $(byText("Search"));
    

    // No page elements added
}