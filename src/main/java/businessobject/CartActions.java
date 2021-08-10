package businessobject;

import pagefactory.CartPopup;
import util.DriverManager;

import java.math.BigDecimal;

public class CartActions {

    CartPopup cartPopup = new CartPopup(DriverManager.getDriver());

    public void getCartPopup(){
        cartPopup.clickCartButton();
        cartPopup.waitForVisibilityOfElement(60, cartPopup.getCartPopup());
    }

    public BigDecimal getTotalAmountOfCart(){
        return cartPopup.getTotalAmountOfCart();
    }

    public boolean totalAmountOfCartIsLessThan(BigDecimal totalAmountOfCart){
        return getTotalAmountOfCart().compareTo(totalAmountOfCart) < 0;
    }
}
