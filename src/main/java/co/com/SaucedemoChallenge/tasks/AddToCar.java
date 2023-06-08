package co.com.SaucedemoChallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.SaucedemoChallenge.userinterfaces.AddToCar.*;

public class AddToCar implements Task {
    public static AddToCar addToCar() {
        return Tasks.instrumented(AddToCar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> products = Text.of(BTN_ADD_TO_CART).viewedBy(actor).asList();
        actor.attemptsTo(

                Click.on(BTN_SELECT_PRODUCT.of("1")),
                Click.on(BTN_SELECT_PRODUCT.of(String.valueOf(products.size() - 1))),
                Click.on(BTN_SELECT_PRODUCT.of(String.valueOf(products.size() - 2))),
                Scroll.to(LOGO),
                Click.on(BTN_SHOPPING_CART)
        );
    }
}
