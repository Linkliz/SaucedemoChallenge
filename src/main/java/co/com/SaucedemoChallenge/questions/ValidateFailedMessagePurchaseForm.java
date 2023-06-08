package co.com.SaucedemoChallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.SaucedemoChallenge.userinterfaces.TotalsValidations.TXT_ERROR_MESSAGE_FORM;

public class ValidateFailedMessagePurchaseForm implements Question {

    private String messageErrorForm;

    public ValidateFailedMessagePurchaseForm(String messageErrorForm) {
        this.messageErrorForm = messageErrorForm;
    }

    @Override
    public Object answeredBy(Actor actor) {
        String error = TXT_ERROR_MESSAGE_FORM.resolveFor(actor).getText();

        if (error.equals(messageErrorForm)) {
            return true;
        }
        return false;
    }

    public static ValidateFailedMessagePurchaseForm ValidateFailedMessagePurchaseForm(String errorMessageForm) {
        return new ValidateFailedMessagePurchaseForm(errorMessageForm);
    }
}
