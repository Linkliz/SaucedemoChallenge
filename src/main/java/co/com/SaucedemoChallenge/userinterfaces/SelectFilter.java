package co.com.SaucedemoChallenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFilter {
    public static final Target BTN_FILTER =
            Target.the("Filter products ")
                    .located(By.xpath("//select[@class='product_sort_container']"));
}
