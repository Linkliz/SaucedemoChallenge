package co.com.SaucedemoChallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddToCar {
    public static final Target BTN_ADD_TO_CART =
            Target.the("Add product to cart")
                    .located(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));

    public static final Target BTN_SELECT_PRODUCT =
            Target.the("Button select product")
                    .locatedBy("(//button[@class='btn btn_primary btn_small btn_inventory'])[{0}]");

    public static final Target TXT_PRICE_PRODUCT =
            Target.the("Text price product")
                    .located(By.xpath("//div[@class='inventory_item_price']"));

    public static final Target BTN_SHOPPING_CART =
            Target.the("Button Shopping Cart")
                    .located(By.xpath("//a[@class='shopping_cart_link']"));
    public static final Target LOGO =
            Target.the("Logo")
                    .located(By.xpath("//div[@class='app_logo']"));
}
