package businessobject;

import io.qameta.allure.Step;
import pagefactory.ProductCatalogPage;
import util.DriverManager;

public class ProductCatalogActions {
    ProductCatalogPage productCatalogPage = new ProductCatalogPage(DriverManager.getDriver());
    @Step("Add firs item to cart")
    public void addFirstItemToCart(){
        productCatalogPage.clickAddToCartButton();
    }
}
