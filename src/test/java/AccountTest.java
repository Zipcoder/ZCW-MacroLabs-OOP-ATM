import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    protected static ArrayList<Account> accounts = new ArrayList();
    private double balance = 0;

    @Test
    public void checkBalance() {
        CheckingAccount checking = new CheckingAccount();
        double expected = 0;
        double actual = checking.checkBalance();
        Assert.assertEquals(expected, actual, 0);

        SavingsAccount savings = new SavingsAccount();
        double saveExpected = 0;
        double saveActual = savings.checkBalance();
        Assert.assertEquals(saveExpected, saveActual, 0);

        InvestmentAccount investing = new InvestmentAccount();
        double investExpected = 0;
        double investActual = investing.checkBalance();
        Assert.assertEquals(investExpected, investActual, 0);
    }

    @Test
    public void addFunds() {

        CheckingAccount checking = new CheckingAccount();
        double expected = 500;
        double actual = checking.addFunds(500);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void withDraw() {

        CheckingAccount checking = new CheckingAccount();
        checking.addFunds(500);

        double expected = 250;
        double actual = checking.withDraw(250);

        Assert.assertEquals(expected, actual, 0);


    }

}