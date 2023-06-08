package co.com.SaucedemoChallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TotalsValidations {
    public static final Target TXT_PRICE_RESULT =
            Target.the("Text price result")
                    .located(By.xpath("//div[@class='inventory_item_price']"));

    public static final Target TXT_PRICE_RESULT_ITEMS =
            Target.the("Text price products")
                    .locatedBy("(//div[@class='inventory_item_price'])[{0}]");

    public static final Target TXT_ITEM_TOTAL =
            Target.the("Text item total")
                    .located(By.xpath("//div[contains(text(), 'Item total: $')]"));

    public static final Target TXT_TAX =
            Target.the("Text tax")
                    .located(By.xpath("//div[@class='summary_tax_label']"));

    public static final Target TXT_TOTAL =
            Target.the("Text total price")
                    .located(By.xpath("//div[@class='summary_info_label summary_total_label']"));

    public static final Target BTN_FINISH =
            Target.the("Text total price")
                    .located(By.xpath("//button[@id='finish']"));

    public static final Target TXT_THANKS =
            Target.the("Thank you message")
                    .located(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));

    public static final Target TXT_ERROR_MESSAGE =
            Target.the("MessageError")
                    .located(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3"));

    public static final Target TXT_ERROR_MESSAGE_FORM =
            Target.the("MessageError")
                    .located(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3"));
}
