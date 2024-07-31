package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public MainPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[contains(@class, 'search-input tt-input')]")
    public WebElement searchField;
    public void enterSearchField () {
        searchField.sendKeys("мастырка");
    }

    @FindBy(xpath = "//button[contains(@class, 'search-button')]")
    public WebElement searchButton;
    public void clickOnSearchButton () {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

    @FindBy(xpath = "//a[@onclick=\"compare.add('482')\"]")
    public WebElement good1Button;
    public void clickOnGood1Button () {
        wait.until(ExpectedConditions.elementToBeClickable(good1Button)).click();
    }

    @FindBy(xpath = "//a[@onclick=\"compare.add('485')\"]")
    public WebElement good2Button;
    public void clickOnGood2Button() {
        wait.until(ExpectedConditions.elementToBeClickable(good2Button)).click();
    }

    @FindBy(xpath = "//a[@onclick=\"compare.add('484')\"]")
    public WebElement good3Button;
    public void clickOnGood3Button() {
        wait.until(ExpectedConditions.elementToBeClickable(good3Button)).click();
    }

    @FindBy(xpath = "(//a[@href=\"https://3kbaits.com.ua/index.php?route=product/compare\"]/span[contains(@class, 'links-text')])[1]")
    public WebElement compareButton;
    public void clickOnCompareButton () {
        wait.until(ExpectedConditions.elementToBeClickable(compareButton)).click();
    }
}
