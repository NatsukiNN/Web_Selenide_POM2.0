package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://askomdch.com/checkout/
public class CheckoutPage {
    public SelenideElement directBankTransferRadioButton = $("#payment_method_bacs");

    public SelenideElement cashOnDeliveryRadioButton = $("#payment_method_cod");

    public SelenideElement placeOrderButton = $("#place_order");

    


    // No page elements added
}