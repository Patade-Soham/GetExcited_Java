abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDeposit extends BankAccount {
    FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06; 
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(10000);
        BankAccount fd = new FixedDeposit(10000);

        System.out.println("Savings Interest: ₹" + sa.calculateInterest());
        System.out.println("Fixed Deposit Interest: ₹" + fd.calculateInterest());
    }
}
