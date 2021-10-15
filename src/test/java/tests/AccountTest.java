package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test(description = "Create account test")
    public void createAccount() {
        boolean isOpened = loginPage
                .open()
                .login(USER, PASSWORD)
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
