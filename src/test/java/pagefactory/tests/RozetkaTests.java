package pagefactory.tests;

import businessobject.CartActions;
import businessobject.FilterActions;
import businessobject.ProductCatalogActions;
import businessobject.SearchActions;
import model.RozetkaFilter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.XmlToObject;


import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class RozetkaTests extends BaseTest {
    @DataProvider(name = "rozetkaFilters")
    public Iterator<Object[]> rozetkaFilters(){
        List<RozetkaFilter> rozetkaFilters = new XmlToObject().getInputData();
        return Stream.of(
                new Object[]{rozetkaFilters.get(0)},
                new Object[]{rozetkaFilters.get(1)}
//                new Object[]{rozetkaFilters.get(2)},
//                new Object[]{rozetkaFilters.get(3)},
//                new Object[]{rozetkaFilters.get(4)}
        ).iterator();
    }
    @Test(dataProvider = "rozetkaFilters")
    public void checkTotalAmountOfAddedToCartProducts(RozetkaFilter rozetkaFilter){
        new SearchActions().searchByWord(rozetkaFilter.getGroupOfThings());
        FilterActions filterActions = new FilterActions();
        filterActions.filterByProducer(rozetkaFilter.getProducer());
        new ProductCatalogActions().addFirstItemToCart();
        CartActions cartActions = new CartActions();
        cartActions.getCartPopup();
        Assert.assertTrue(cartActions.totalAmountOfCartIsLessThan(rozetkaFilter.getTotalAmount()));
    }
}


