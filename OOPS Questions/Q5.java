public class Q5 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        // setter method
        ba.setAccountHolderName("pookie");
        ba.setAccountNumber(12435);
        ba.setBalance(50000.63);

        // getter method

        System.out.println("Account number is : " + ba.getAccountNumber());
        System.out.println("Account holder name is : " + ba.getAccountHolderName());
        System.out.println("Account Balance is : " + ba.getBalance());
    }
}

class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

}
