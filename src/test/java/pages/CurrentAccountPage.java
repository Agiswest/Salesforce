package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurrentAccountPage extends BasePage {

    public CurrentAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CurrentAccountPage open() {
        return this;
    }

    @Step("Get name of account")
    public String getNameOfAccount() {
        return driver.findElement(By.xpath("//*[@class='slds-media__body']" +
                "//span[@data-aura-class='uiOutputText'][normalize-space(.)]")).getText();
    }
}
