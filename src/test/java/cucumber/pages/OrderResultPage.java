package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://askomdch.com/checkout/order-received/25882/?key=wc_order_yxkrZGFQGeahX
public class OrderResultPage {
    public OrderResultPage() {

    }
    public SelenideElement totalCost = $x("//li[contains(@class, 'total')]//bdi");

    public String getSubTotalCost() {
        return totalCost.getText();
    }

    // No page elements added
}