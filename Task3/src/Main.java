
//java parogram to add three number
//In Java, import java.util.Scanner; is a statement that imports the Scanner class from the java.util package. The Scanner class is used to read input from the user in the console.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum of the three numbers: " + sum);

        scanner.close();
    }
}
