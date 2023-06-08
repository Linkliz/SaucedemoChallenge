package co.com.SaucedemoChallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RemoveProduct {
    public static final Target BTN_REMOVE_PRODUCTS = Target.the("button for remove products")
            .located(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));

    public static final Target BTN_REMOVE =
            Target.the("Button remove selected")
                    .locatedBy("(//button[@class='btn btn_secondary btn_small cart_button'])[{0}]");

    public static final Target BTN_CHECKOUT=
            Target.the("Button checkout")
                    .located(By.xpath("//button[@id='checkout']"));
}
