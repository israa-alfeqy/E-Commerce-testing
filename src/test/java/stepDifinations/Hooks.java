package stepDifinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.*;

import java.util.concurrent.TimeUnit;
public class Hooks {
    public static WebDriver driver;
    public static SoftAssert soft;

    @Before

    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\maven_plugin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After

    public static void closeBrowser() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }
}
