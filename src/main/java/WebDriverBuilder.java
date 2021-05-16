import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBuilder {
    private WebDriver driver;

    enum Name {
        chrome,
        firefox,
        edge
    }

    public WebDriver build(Name name){


        switch (name) {
            case chrome -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case firefox -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case edge -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        return driver;
    }

}
