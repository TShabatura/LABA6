package businessobject;

import io.qameta.allure.Step;
import model.RozetkaFilter;
import pagefactory.ProductCatalogPage;
import util.DriverManager;

public class FilterActions {

    ProductCatalogPage productCatalogPage = new ProductCatalogPage(DriverManager.getDriver());

    @Step("Filter products by producer {0}")
    public void filterByProducer(String producer){
        productCatalogPage.waitForPageLoadingComplete(60);
        productCatalogPage.searchByProducer(producer);
        productCatalogPage.waitForFiltering(60);
        productCatalogPage.filterByProducer();
        productCatalogPage.waitForPageLoadingComplete(60);
    }
}
