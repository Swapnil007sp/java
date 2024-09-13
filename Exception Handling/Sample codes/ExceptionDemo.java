import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Division Is : ");
        System.out.println(num1 / num2);
    }
}