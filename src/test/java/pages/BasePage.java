package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = System.getenv().getOrDefault("SALESFORCE_URL",
            PropertyReader.getProperty("salesforce.url"));

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public abstract BasePage open();

    public void openMenu(String menu) {

    }
}
