package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.PropertyReader;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class BaseTest {

    LoginPage loginPage;
    String email;

    @BeforeMethod
    public void setUp(){
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL", PropertyReader.getProperty("qase.url"));
        email = System.getenv().getOrDefault("QASE_URL", PropertyReader.getProperty("qase.url"));
  //      Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
        Configuration.timeout = 5000;

        loginPage = new LoginPage();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        Configuration.browserCapabilities = chromeOptions;


    }

    @AfterMethod(alwaysRun =true)
    public void tearDown(){
        getWebDriver().quit();
    }

}
