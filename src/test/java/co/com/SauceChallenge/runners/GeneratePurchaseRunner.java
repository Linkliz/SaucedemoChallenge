package co.com.SauceChallenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/generatePurchase.feature",
        glue = "co.com.SauceChallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GeneratePurchaseRunner {
}
