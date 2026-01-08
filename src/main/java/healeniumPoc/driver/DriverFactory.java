package healeniumPoc.driver;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver createDriver() {
        WebDriver delegate = new ChromeDriver();
        return SelfHealingDriver.create(delegate);
    }
}