package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        boolean isOpened = loginPage
                .open()
                .login("maximus200064-xbln@force.com", "testPass1112")
                .isOpened();
        assertTrue(isOpened, "Home page wasn't opened");

        accountPage.open();
        accountPage.clickNew();

        Account account = AccountFactory.get();
        accountPage.createAccount(account);
        accountPage.clickSave();
        //accountPage.validateAccount(account);
    }
}
