package businessobject;

import model.RozetkaFilter;
import pagefactory.ProductCatalogPage;
import util.DriverManager;

public class FilterActions {

    ProductCatalogPage productCatalogPage = new ProductCatalogPage(DriverManager.getDriver());

    public void filterByProducer(String producer){
        productCatalogPage.waitForPageLoadingComplete(60);
        productCatalogPage.searchByProducer(producer);
        productCatalogPage.waitForFiltering(60);
        productCatalogPage.filterByProducer();
        productCatalogPage.waitForPageLoadingComplete(60);
    }
}
