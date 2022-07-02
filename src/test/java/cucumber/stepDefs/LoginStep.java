package cucumber.stepDefs;

import cucumber.pages.AccountPage;
import cucumber.pages.TopBarMenu;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.*;
import cucumber.dataModel.UserDataReader;

public class LoginStep {
    private UserDataReader userDataReader;
    AccountPage accountPage = page(AccountPage.class);
    TopBarMenu topBarMenu = new TopBarMenu();

    public LoginStep(UserDataReader userDataReader){
        this.userDataReader = userDataReader;
    }

    @Given("I login to AskOmDch account as {string}")
    public void iLoginToAskOmDchAs(String validUser) {
        String username = this.userDataReader.getUserProfile(validUser).getUsername();
        String password = this.userDataReader.getUserProfile(validUser).getPassword();

        topBarMenu.accountLink.click();
        accountPage.usernameInput.val(username);
        accountPage.passwordInput.val(password);
        accountPage.loginButton.click();
    }
}
