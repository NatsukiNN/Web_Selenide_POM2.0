package cucumber.stepDefs;

import com.codeborne.selenide.Condition;
import cucumber.dataModel.UserDataReader;
import cucumber.pages.StorePage;
import cucumber.pages.TopBarMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.extension.ExtensionContext;

import static com.codeborne.selenide.Selenide.page;

public class StoreStep {

    StorePage storePage = page(StorePage.class);

    @When("I search {string}")
    public void iAmInDefaultPageInAskOmDch(String string) {
        storePage.searchInput.val(string);
        storePage.searchButton.click();
    }
}
