package businessobject;

import pagefactory.ProductCatalogPage;
import util.DriverManager;

public class ProductCatalogActions {
    ProductCatalogPage productCatalogPage = new ProductCatalogPage(DriverManager.getDriver());

    public void addFirstItemToCart(){
        productCatalogPage.clickAddToCartButton();
    }
}
