import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {
    CashRegister register1,register2;
    @BeforeEach
    void setUp(){
        register1 = new CashRegister(1,1);
        register2 = new CashRegister();
    }
    @Test
    void changeForRegister1(){
        register1.recordPurchase(29.50);
        register1.recordPurchase(9.25);
        register1.recordPayment(100);
        assertEquals(61.25,register1.giveChange());
    }
    @Test
    void changeForRegister2(){
        register2.recordPurchase(30);
        register2.recordPurchase(9);
        register2.recordPayment(50);
        assertEquals(11,register2.giveChange());
    }
    @Test
    void recordPurchase() {
    }

    @Test
    void recordPayment() {
    }

    @Test
    void giveChange() {
    }
}