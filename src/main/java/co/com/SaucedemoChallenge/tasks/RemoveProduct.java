package co.com.SaucedemoChallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.SaucedemoChallenge.userinterfaces.RemoveProduct.*;

public class RemoveProduct implements Task {
    public static RemoveProduct removeProduct() {
        return Tasks.instrumented(RemoveProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REMOVE_PRODUCTS, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(10).seconds()
        );

        List<String> productos = Text.of(BTN_REMOVE_PRODUCTS).viewedBy(actor).asList();

        int idProduct = 1;

        actor.attemptsTo(

                WaitUntil.the(BTN_REMOVE.of(String.valueOf(idProduct)),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_REMOVE.of(String.valueOf(idProduct)))
        );

        actor.attemptsTo(
                Click.on(BTN_CHECKOUT)
        );
    }
}

