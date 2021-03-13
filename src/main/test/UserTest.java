





// Test the expected User class from ATM.

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {


//    @Test   // tests default constructor
//    public void nulleryConstructorTest() {
//    }
//
//    @Test   // tests default constructor
//    public void nulleryConstructorTestNeg() {
//    }
//
//    @Test   // tests constructor for user with name & password
//    public void constructorUserNamePWTest() {
//    }
//
//    @Test   // tests constructor for user with name & password
//    public void constructorUserNamePWTestNeg() {
//    }
//
//    @Test   // tests constructor for user with name, password & accounts array
//    public void constructorUserNamePWAcctsTest() {
//    }
//
//    @Test   // tests constructor for user with name, password & accounts array
//    public void constructorUserNamePWAcctsTestNeg() {
//    }

    @Test   // method sets/resets username  how to test: create user, pass in name arg, use set/reset method
            // double check return is the new value you set it to, not the first argument that you
            // passed in w/ get method
    public void setUsernameTest() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String newUsername = "User02";
        testUser.setUsername(newUsername);
        String actualUsername = testUser.getUsername();

        Assert.assertEquals(actualUsername, newUsername);
    }

    @Test
    public void setUsernameTestNeg() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String newUsername = "User02";
        testUser.setUsername(newUsername);
        String actualUsername = testUser.getUsername();

        Assert.assertEquals(actualUsername, newUsername);
    }

    @Test   // method returns username   how to test: pass in username value, check to make sure username returned
            // is same as what you passed in
    public void getUserNameTest() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String actualUsername = testUser.getUsername();

        Assert.assertEquals(actualUsername, expectedUsername);
    }

    @Test
    public void getUserNameTestNeg() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String actualUsername = testUser.getUsername();

        Assert.assertNotEquals(actualUsername, "unknown");
    }

    @Test   // method sets/resets username  how to test: create user, pass in name arg, use set/reset method
            // double check return is the new value you set it to, not the first argument that you
            // passed in w/ get method
    public void setPasswordTest() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String newPassword = testUser.setPassword(expectedPassword);
        String actualPassword = testUser.getUsername();

        Assert.assertEquals(actualPassword, newPassword);
    }

    @Test
    public void setPasswordTestNeg() {
        String initialUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(initialUsername, expectedPassword);
        String newPassword = testUser.setPassword(expectedPassword);
        String actualPassword = testUser.getUsername();

        Assert.assertNotEquals(actualPassword, initialUsername);
    }

    @Test   // method returns username   how to test: pass in username value, check to make sure username returned
            // is same as what you passed in
    public void getPasswordTest() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String actualPassword = testUser.getPassword();

        Assert.assertEquals(actualPassword, expectedPassword);
    }

    @Test
    public void getPasswordTestNeg() {
        String expectedUsername = "User01";
        String expectedPassword = "password123";
        User testUser = new User(expectedUsername, expectedPassword);
        String actualPassword = testUser.getPassword();

        Assert.assertNotEquals(actualPassword, "Unknown");
    }

    @Test   // method returns user's array of accounts  how to test: check to make sure accounts array returned
            // (return as a string with .toString method) convert original accounts array to string
            // matches original, passed in array   make array   use .toString method on it
            // need accounts constructor to make multiple instances of accounts, pass into array, pass array into
            // constructor of user
    public void getAccountsArrayTest() {
        Account account1 = new Account(accountNumber, availableBalance);
        Account account2 = new Account(accountNumber, availableBalance);
        Account account3 = new Account(accountNumber, availableBalance);
        Account[] accountsArr = {account1, account2, account3};
        String initialArrString = accountsArr.toString();
        User testUser = new User("User01", "password123", accountsArr);
        String actualArrString = accountsArr.toString(accountsArr.getAccounts());

        Assert.assertEquals(actualArrString, initialArrString);

    }

    @Test
    public void getAccountsArrayTestNeg() {
        Account account1 = new Account(accountNumber, availableBalance);
        Account account2 = new Account(accountNumber, availableBalance);
        Account account3 = new Account(accountNumber, availableBalance);
        Account[] accountsArr = {account1, account2, account3};
        String initialArrString = accountsArr.toString();
        User testUser = new User("User01", "password123", accountsArr);
        String actualArrString = accountsArr.toString(accountsArr.getAccounts());

        Assert.assertNotEquals(actualArrString, "5");
    }

    @Test   // method adds account to user's array of accounts  how to test: check to make sure accounts array returns
            // initial accounts array passed in
            // (return as a string with .toString method) convert original accounts array to string
            // matches original, passed in array   make array   use .toString method on it
            // use .addAccount method, pass in account to add
            // change output array to string, compare strings to strings
            // save expected string to variable to pass in for expected assert type in your expected string
            // need accounts constructor to make multiple instances of accounts, pass into array, pass array into
            // constructor of user
    public void addAccountTest() {
        Account account1 = new Account(accountNumber, availableBalance);
        Account account2 = new Account(accountNumber, availableBalance);
        Account account3 = new Account(accountNumber, availableBalance);
        Account account4 = new Account(accountNumber, availableBalance);
        Account[] accountsArr = {account1, account2, account3};
        String initialArrString = accountsArr.toString();
        User testUser = new User("User01", "password123", accountsArr);
        testUser.addAccount(accounts, account4);
        String actualArrString = accountsArr.toString(accountsArr.getAccounts());

        Assert.assertEquals(actualArrString, initialArrString);
    }

    @Test
    public void addAccountTestNeg() {
        Account account1 = new Account(accountNumber, availableBalance);
        Account account2 = new Account(accountNumber, availableBalance);
        Account account3 = new Account(accountNumber, availableBalance);
        Account account4 = new Account(accountNumber, availableBalance);
        Account[] accountsArr = {account1, account2, account3};
        String initialArrString = accountsArr.toString();
        User testUser = new User("User01", "password123", accountsArr);
        testUser.addAccount(accounts, account4);
        String actualArrString = accountsArr.toString(accountsArr.getAccounts());

        Assert.assertNotEquals( actualArrString, 5);
    }

    @Test   // method adds account to user's array of accounts  how to test: check to make sure accounts array returns
            // initial accounts array passed in
            // (return as a string with .toString method) convert original accounts array to string
            // matches original, passed in array   make array   use .toString method on it
            // use .addAccount method, pass in account to add
            // change output array to string, compare strings to strings
            // save expected string to variable to pass in for expected assert type in your expected string
            // need accounts constructor to make multiple instances of accounts, pass into array, pass array into
            // constructor of user
    public void removeAccountTest() {
        Account account1 = new Account(accountNumber, availableBalance);
        Account account2 = new Account(accountNumber, availableBalance);
        Account account3 = new Account(accountNumber, availableBalance);
        Account account4 = new Account(accountNumber, availableBalance);
        Account[] accountsArr = {account1, account2, account3, account4};
        Account[] expectedArr = {account1, account3, account4};
        String expectedArrString = expectedArr
        User testUser = new User("User01", "password123", accountsArr);
        testUser.removeAccount(accounts, account2);
        String actualArrString = accountsArr.toString(accountsArr.getAccounts());

        Assert.assertEquals(actualArrString, expectedArrString);
    }

    @Test
    public void removeAccountTestNeg() {
        Account account1 = new Account(accountNumber, availableBalance);
        Account account2 = new Account(accountNumber, availableBalance);
        Account account3 = new Account(accountNumber, availableBalance);
        Account account4 = new Account(accountNumber, availableBalance);
        Account[] accountsArr = {account1, account2, account3, account4};
        Account[] expectedArr = {account1, account3, account4};
        String expectedArrString = expectedArr
                User testUser = new User("User01", "password123", accountsArr);
        testUser.removeAccount(accounts, account2);
        String actualArrString = accountsArr.toString(accountsArr.getAccounts());

        Assert.assertNotEquals(actualArrString, 5);
    }


}























}
