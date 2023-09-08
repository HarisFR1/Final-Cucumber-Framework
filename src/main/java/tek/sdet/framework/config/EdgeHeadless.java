package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class EdgeHeadless implements Browser{
    @Override
    public WebDriver openBrowser(String url) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        WebDriver driver = new EdgeDriver(options);
        driver.get(url);
        return driver;
    }
}
