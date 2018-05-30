import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by dmyv on 10/11/16.
 */
public class MainPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    @FindBy(css = "input[value='title']")
    WebElement titleRadioBtn;

    @FindBy(id = "q")
    WebElement searchInputField;

    @FindBy(css = "input[type='submit']")
    WebElement searchButton;

    public MainPage(WebDriver driver) {
        webDriver = driver;
        wait = new WebDriverWait(webDriver,30);

        PageFactory.initElements(webDriver, this);
    }
    public void switchSearchToTitle() {
        titleRadioBtn.click();
    }
    public void enterSearchableText(String text) {
        searchInputField.clear();
        searchInputField.sendKeys(text);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
}
