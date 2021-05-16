import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class BasicTest
{

    @Test
    public void startTest(){

        WebDriverBuilder driverBuilder = new WebDriverBuilder();
        WebDriver driver = driverBuilder.build(WebDriverBuilder.Name.firefox);
        String targetUrl = "https://www.google.com/";
        driver.get(targetUrl);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        assertEquals(targetUrl, currentUrl);
        driver.close();
    }

}
