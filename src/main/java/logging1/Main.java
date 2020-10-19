package logging1;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(100d);
        bank.withdraw(20d);
        bank.retrieveBalance();
    }
}