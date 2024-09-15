class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public BankAccount(String accountNumber , double balance){
        this.balance=balance;
        this.accountNumber = accountNumber;

    }

    public void deposit(double deposit) throws InsufficientFundsException {
        if (deposit <= 0) {
            throw new InsufficientFundsException("This amount cannot be deposited!");
        }
        this.balance = balance + deposit;
    }

    public void withdraw(double withdraw) throws InvalidAmountException {
        if (withdraw < 0 || withdraw > balance) {
            throw new InvalidAmountException("This amount cannot be withdraw!");
        }
        this.balance = balance - withdraw;
    }

    public double getBalance() {
        return balance;
    }
}