package co.com.SaucedemoChallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.SaucedemoChallenge.userinterfaces.TotalsValidations.TXT_ERROR_MESSAGE;
public class ValidateFailedMessageLogin implements Question {

    private String errorMessage;

    public ValidateFailedMessageLogin(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public Object answeredBy(Actor actor) {
        String messageFinal = TXT_ERROR_MESSAGE.resolveFor(actor).getText();

        if (messageFinal.equals(errorMessage)) {
            return true;
        }
        return false;
    }

    public static ValidateFailedMessageLogin ValidateFailedMessageLogin(String errorMessage) {
        return new ValidateFailedMessageLogin(errorMessage);
    }

}
