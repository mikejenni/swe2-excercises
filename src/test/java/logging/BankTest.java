package logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {



    private Bank bank1;

    @BeforeEach
    void setup(){
        bank1 = new Bank(500);


    }

    @Test
    void shouldWithdrawHundret() throws Exception{
        assertEquals(400, bank1.withdraw(100));
    }

    @Test
    void shouldThrowException() {
        assertThrows(Exception.class, () -> bank1.withdraw(1000));
    }

    @Test
    void shouldDepositOneHundret() {
        assertEquals(600, bank1.deposit(100));
    }
}