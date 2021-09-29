package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage open() {
        driver.get(baseUrl + "lightning/page/home");
        return this;
    }

    public boolean isOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oneHeader")));
        } catch (TimeoutException exception) {
            return false;
        }
        return true;
    }
}
