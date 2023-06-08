package co.com.SaucedemoChallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.SaucedemoChallenge.userinterfaces.TotalsValidations.BTN_FINISH;
import static co.com.SaucedemoChallenge.userinterfaces.TotalsValidations.TXT_THANKS;

public class Answer implements Question {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(
                Click.on(BTN_FINISH)
        );

        Boolean result;
        String message = Text.of(TXT_THANKS).viewedBy(actor).asString();
        if (question.equals(message)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
