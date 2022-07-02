package cucumber.stepDefs;

import com.codeborne.selenide.Condition;
import cucumber.pages.CheckoutPage;
import cucumber.pages.OrderResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.page;

public class OrderResultStep {

    OrderResultPage orderResultPage = page(OrderResultPage.class);

    @Then("Total cost is {string}")
    public void totalCostIsString(String cost){
        orderResultPage.totalCost.shouldHave(Condition.text(cost));
    }


}
