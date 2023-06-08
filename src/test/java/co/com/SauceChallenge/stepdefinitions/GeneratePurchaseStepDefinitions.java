package co.com.SauceChallenge.stepdefinitions;

import co.com.SaucedemoChallenge.models.UserData;
import co.com.SaucedemoChallenge.questions.*;
import co.com.SaucedemoChallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class GeneratePurchaseStepDefinitions {

    @Managed(driver = "chrome")
    static WebDriver driver;

    @Before
    public void configuration() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Liz");
    }

    @Given("^the user wants to purchase three products$")
    public void theUserWantsToPurchaseThreeProducts() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com"));
    }

    @When("^the user to needs his credentials for the access$")
    public void theUserToNeedsHisCredentialsForTheAccess(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.the(userData.get(0)));
    }

    @When("^the user has sorted the products from lowest to highest value$")
    public void theUserHasSortedTheProductsFromLowestToHighestValue() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectFilter.selectFilter());
    }

    @When("^the user adds to the cart the lowest priced product, the highest priced product and another product with any price$")
    public void theUserAddsToTheCartTheLowestPricedProductTheHighestPricedProductAndAnotherProductWithAnyPrice() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCar.addToCar());
    }

    @When("^the user navigates to the cart page and removes one of the products$")
    public void theUserNavigatesToTheCartPageAndRemovesOneOfTheProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(RemoveProduct.removeProduct());
    }

    @When("^the user completes the checkout process, enters the required data and continues with the purchase$")
    public void theUserCompletesTheCheckoutProcessEntersTheRequiredDataAndContinuesWithThePurchase(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseData.the(userData.get(0)));
    }

    @Then("^the user validates the total items$")
    public void theUserValidatesTheTotalItems() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotalITems.validateTotalITems(), Matchers.is(true)));
    }

    @Then("^the user validates the total price$")
    public void theUserValidatesTheTotalPrice() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotalPrice.validateTotalPrice(), Matchers.is(true)));
    }

    @Then("^user validates purchase success total with a message$")
    public void userValidatesPurchaseSuccessTotalWithAMessage(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(userData.get(0).getMessageFinal())));
    }

    @Then("^the user displays the error message login$")
    public void theUserDisplaysTheErrorMessageLogin(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateFailedMessageLogin.ValidateFailedMessageLogin(userData.get(0).getMessageError()), Matchers.is(true)));
    }

    @Then("^the user displays the error message$")
    public void theUserDisplaysTheErrorMessage(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateFailedMessagePurchaseForm.ValidateFailedMessagePurchaseForm(userData.get(0).getMessageErrorForm()), Matchers.is(true)));
    }

}
