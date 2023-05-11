package base;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class baseTest {
    static WebDriver webDriver=null;

    final Logger logger = Logger.getLogger(baseTest.class);

    @Before
    public void setUp(){

        logger.info("Test Başladı");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");

    }
    public static WebDriver getWebDriver() {
        return  webDriver;
    }
    public static void setWebDriver(WebDriver webDriver) {
        baseTest.webDriver=webDriver;
    }

    @After
    public void quit(){
        logger.info("Test Bitti");
        getWebDriver().quit();
    }

}
