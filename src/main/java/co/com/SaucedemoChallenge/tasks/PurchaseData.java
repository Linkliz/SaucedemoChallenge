package co.com.SaucedemoChallenge.tasks;

import co.com.SaucedemoChallenge.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.SaucedemoChallenge.userinterfaces.PurchaseData.*;

public class PurchaseData implements Task {

    private UserData userData;

    public PurchaseData(UserData userData) {
        this.userData = userData;
    }
    public static PurchaseData the(UserData userData) {
        return Tasks.instrumented(PurchaseData.class,userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_FIRSTNAME, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(60).seconds(),
                Enter.theValue(userData.getName()).into(TXT_FIRSTNAME),
                Enter.theValue(userData.getLastName()).into(TXT_LASTNAME),
                Enter.theValue(userData.getCodePostal()).into(TXT_CODE_POSTAL),
                Click.on(BTN_CONTINUE)
        );
    }
}
