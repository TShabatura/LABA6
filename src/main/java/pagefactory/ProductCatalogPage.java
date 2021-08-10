package pagefactory;

import decorator.pageobjectcontrols.Button;
import decorator.pageobjectcontrols.Checkbox;
import decorator.pageobjectcontrols.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class ProductCatalogPage extends BasePage {
    @FindBy(xpath = "//app-buy-button")
    private Button addToCartButton;

    @FindBy(xpath = "//div[@data-filter-name='producer']//input[@name='searchline']")
    private TextInput producerSearchBox;

    @FindBy(xpath = "//div[@data-filter-name='producer']//label")
    private List<Checkbox> checkboxProducerFilter;

    private final By CHECKBOX_LOCATOR = By.xpath("//div[@data-filter-name='producer']//label");

    public ProductCatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void searchByProducer(String producer) {
        producerSearchBox.sendKeys(producer, Keys.ENTER);
    }

    public void filterByProducer() {
        checkboxProducerFilter.get(0).click();
    }

    public void waitForFiltering(long timeToWait) {
        new WebDriverWait(driver, timeToWait).
                until(ExpectedConditions.
                numberOfElementsToBeLessThan(CHECKBOX_LOCATOR, checkboxProducerFilter.size()));
    }
}
