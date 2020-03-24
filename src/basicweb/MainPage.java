package basicweb;

import com.google.common.annotations.VisibleForTesting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.utilities.Assert;


public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//h3[@class='head text-center'][text()='Welcome to Selenium Easy ']")
    WebElement welcomeMainPage;


    @FindBy(id = "btn_basic_example")
    WebElement startPractising_Button;


    public String getWelcomePageText(){
        return welcomeMainPage.getText();
    }

    @Before
    public void setUp(){
        System.getProperty("webdriver.gecko.driver", "/Users/tyzajkacper/Programowanie/workspace_personal/libs/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String url = "https://www.seleniumeasy.com/test/";
        driver.get(url);
    }

    @After
    public void tearDown(){

        driver.close();
    }

    @Test
    public void testStartPractisingButtonIsEnabled(){

        assert startPractising_Button.isEnabled();
    }



}
