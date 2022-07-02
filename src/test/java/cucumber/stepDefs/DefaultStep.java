package cucumber.stepDefs;

import com.codeborne.selenide.Condition;
import cucumber.dataModel.UserDataReader;
import cucumber.pages.AccountPage;
import cucumber.pages.TopBarMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;

public class DefaultStep {
    private UserDataReader userDataReader;

    TopBarMenu topBarMenu = page(TopBarMenu.class);

    @Then("I can see TopBar of AskOmDch")
    public void iAmInDefaultPageInAskOmDch() {
        topBarMenu.topLink.shouldHave(Condition.appear);
    }
    @When("I click store page button")
    public void iClickStorePageButton(){
        topBarMenu.storeLink.click();
    }
}
