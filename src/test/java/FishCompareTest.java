import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;

import java.time.Duration;
@Listeners({AllureTestNg.class})

public class FishCompareTest {

        private WebDriver driver;
        private WebDriverWait wait;
        private MainPage mainPage;

        @BeforeTest
        void setupDriver() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.get("https://3kbaits.com.ua/");
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            mainPage = new MainPage(driver);
        }

        @Test

        public void ClickTest(){
            mainPage.enterSearchField();
            mainPage.clickOnSearchButton();
            mainPage.clickOnGood1Button();
            mainPage.clickOnGood2Button();
            mainPage.clickOnGood3Button();
            mainPage.clickOnCompareButton();
            Assert.assertEquals(driver.findElements(By.xpath("//td/a")).size(), 3);
        }

     @AfterTest
        void closeDriver(){
            driver.quit();
        }
    }

