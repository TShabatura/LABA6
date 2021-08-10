package pagefactory;

import decorator.pageobjectcontrols.Button;
import decorator.CustomFieldDecorator;
import decorator.pageobjectcontrols.TextInput;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    @FindBy(xpath = "//button[@opencart]")
    private Button cartButton;

    @FindBy(xpath = "//input[@name='search']")
    private TextInput searchBox;

    @FindBy(xpath = "//div[@class = 'modal__content']")
    private WebElement cartPopup;

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new CustomFieldDecorator(driver), this);
    }

    public void waitForPageLoadingComplete(long timeToWait) {
        new WebDriverWait(driver, timeToWait).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForVisibilityOfElement(long timeToWait, WebElement element) {
        new WebDriverWait(driver, timeToWait).until(ExpectedConditions.visibilityOf(element));
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void inputSearchData(String input) {
        searchBox.sendKeys(input, Keys.ENTER);
    }

    public WebElement getCartPopup() {
        return cartPopup;
    }
}
