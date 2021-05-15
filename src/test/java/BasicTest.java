import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class BasicTest
{

    @Test
    public void startTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String targetUrl = "https://www.google.com/";
        driver.get(targetUrl);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        assertEquals(targetUrl, currentUrl);
        driver.close();
    }

}
