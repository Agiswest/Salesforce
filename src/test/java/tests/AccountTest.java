package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        boolean isOpened = loginPage
                .open()
                .login("maximus200064-xbln@force.com", "testPass1112")
                .isOpened();
        assertTrue(isOpened, "Home page wasn't opened");

        Account account = AccountFactory.get();
        String newAccountName = accountPage
                .open()
                .clickNew()
                .createAccount(account)
                .clickSave()
                .getNameOfAccount();
        assertEquals(newAccountName, account.getAccountName(),
                "Account wasn't created");
    }
}
