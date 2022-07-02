package cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://askomdch.com/account/
public class AccountPage {
    public SelenideElement usernameInput = $("#username" );

    public SelenideElement passwordInput = $("#password");

    public SelenideElement loginButton = $(byName("login"));
    
}