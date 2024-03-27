package Prac;
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded. Maximum withdrawal allowed: $" + withdrawalLimit);
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;

    public CheckingAccount(double initialBalance, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount + withdrawalFee <= balance) {
            balance -= (amount + withdrawalFee);
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Withdrawal fee applied: $" + withdrawalFee);
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
        displayBalance();
    }
}

public class Exp21 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 500);
        CheckingAccount checkingAccount = new CheckingAccount(1500, 1.5);

        // Deposit and withdraw from savings account
        savingsAccount.deposit(200);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(600);

        System.out.println();

        // Deposit and withdraw from checking account
        checkingAccount.deposit(300);
        checkingAccount.withdraw(100);
        checkingAccount.withdraw(1600);
    }
}