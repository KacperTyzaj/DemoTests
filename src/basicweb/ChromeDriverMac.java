package basicweb;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverMac {
    public static void main(String[] args){

        //System.getProperty("webdriver.chrome.driver", "/Users/tyzajkacper/Programowanie/workspace_personal/libs/drivers/chromedriver");
        //WebDriver driver = new ChromeDriver();

        System.getProperty("webdriver.gecko.driver", "/Users/tyzajkacper/Programowanie/workspace_personal/libs/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String url = "https://www.seleniumeasy.com/test/";
        driver.get(url);





        driver.close();


    }
}
