package co.com.SaucedemoChallenge.tasks;

import co.com.SaucedemoChallenge.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.SaucedemoChallenge.userinterfaces.Login.*;

public class Login implements Task {

    private UserData userData;

    public Login(UserData userData) {
        this.userData = userData;
    }

    public static Login the(UserData userData) {
        return Tasks.instrumented(Login.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USER, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(60).seconds(),
                Enter.theValue(userData.getUsername()).into(INPUT_USER),
                Enter.theValue(userData.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN));
    }
}
