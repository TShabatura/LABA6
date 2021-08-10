package businessobject;

import pagefactory.BasePage;
import util.DriverManager;

public class SearchActions {
    BasePage basePage = new BasePage(DriverManager.getDriver());

    public void searchByWord(String word){
        basePage.inputSearchData(word);
    }
}
