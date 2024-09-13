import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Annount to deposite  : ");
        double amount = sc.nextDouble();

        BankAccount ba = new BankAccount();
        ba.deposite(amount);
    }
}

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public void deposite(double amount) {
        try {
            if (amount < 0 || amount == 0) {
                throw new Exception("IllegalArgumentException");
            } else {
                System.out.println("valid Entry : " + amount);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Code is working");
        }
    }
}