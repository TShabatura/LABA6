package businessobject;

import io.qameta.allure.Step;
import org.testng.Assert;

import java.math.BigDecimal;

public class Verifier {
    CartActions cartActions = new CartActions();
    @Step("Verify that total amount of cart is less than {0}")
    public void verifyThatTotalAmountOfCartIsLessThan(BigDecimal totalAmountOfCart){
        Assert.assertTrue(cartActions.totalAmountOfCartIsLessThan(totalAmountOfCart));
    }
}
