package businessobject;

import io.qameta.allure.Step;
import pagefactory.BasePage;
import util.DriverManager;

public class SearchActions {
    BasePage basePage = new BasePage(DriverManager.getDriver());

    @Step("Search by word '{0}'")
    public void searchByWord(String word){
        basePage.inputSearchData(word);
    }
}
