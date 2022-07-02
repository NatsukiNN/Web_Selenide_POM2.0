package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Link;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://askomdch.com/
public class TopBarMenu {
    public SelenideElement storeLink = $(byText("Store"));

    public SelenideElement accountLink = $(byText("Account"));

    public SelenideElement homeLink = $(byText("Home"));

    public SelenideElement topLink = $(byText("AskOmDch"));

    public SelenideElement cartMenu = $x("//div[contains(@class, 'site-header-section')][.//*[@id='menu-item-1226']]//span");



    
    
}