package co.com.SaucedemoChallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseData {
    public static final Target TXT_FIRSTNAME =
            Target.the("Input firstname")
                    .located(By.xpath("//input[@id='first-name']"));

    public static final Target TXT_LASTNAME =
            Target.the("Input lastname")
                    .located(By.xpath("//input[@id='last-name']"));

    public static final Target TXT_CODE_POSTAL =
            Target.the("Input postal code")
                    .located(By.xpath("//input[@id='postal-code']"));

    public static final Target BTN_CONTINUE =
            Target.the("Button continue")
                    .located(By.xpath("//input[@id='continue']"));
}
