public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double ammount){
        balance+=ammount;
    }

    public void withdraw(double ammount){
        balance-=ammount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
