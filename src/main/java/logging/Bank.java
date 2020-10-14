package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    final Logger logger = (Logger) LoggerFactory.getLogger(Bank.class);

    private double balance = 100d;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) throws Exception{

        if (balance - amount < 0) {
            throw new Exception("Balance is to Low");
        }
        balance = balance - amount;
        return balance;
    }

    public double deposit(double amount){
        balance = balance + amount;
        return balance;


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double retrieveBalance(){
        return balance;

    }

}
