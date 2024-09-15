public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12354443746" , 100);
        try {
            double diposit = 50 ;
            bankAccount.deposit(diposit);
            System.out.println("Depositing $"+ diposit);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        System.out.println("New balance:" + bankAccount.getBalance());
        try {
            double withdraw = 200;
            System.out.println("Attempting to withdraw $"+ withdraw);
            bankAccount.withdraw(withdraw);
        } catch (InvalidAmountException e) {
           e.printStackTrace();
        }
        try {
            System.out.println("Attempting to withdraw $"+50);
            bankAccount.withdraw(50);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Attempting to deposit "+-10);
            bankAccount.deposit(-10);
            System.out.println();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance:" + bankAccount.getBalance());
     
         System.out.println("End of transaction.");
    }
}
