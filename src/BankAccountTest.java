import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount account1,account2;
    @BeforeEach
    void setUp() {
        account1 = new BankAccount(100);
        account2 = new BankAccount(500);
    }
    @Test
    void getBankBalanceforAccount1() {
        account1.deposit(50);
        account1.withdraw(50);
        assertEquals(100, account1.getBalance());
    }
        @Test
        void getBankBalanceforAccount2(){
        account2.deposit(50);
        account2.deposit(50);
        account2.deposit(50);
        account2.withdraw(50);
        account2.withdraw(50);
        assertEquals(550,account2.getBalance());
    }

    @Test
    void deposit() {
    }

    @Test
    void withdraw() {
    }

    @Test
    void getBalance() {
    }
}