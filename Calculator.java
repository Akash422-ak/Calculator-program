import java.util.*;
public class Calculator {
    public static void main (String[] args) {

        double num1;
        double num2;
        char choice;
        double result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        num1 = sc.nextDouble();

        System.out.print(" Select your operator: (+,-,*,/,%)");
        choice = sc.next().charAt(0);

        System.out.print("Enter the Second Number: ");
        num2 = sc.nextDouble();

        switch (choice) {

            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.print("Invalid input");
                }
            }
            case '%' -> result = num1%num2;
            default -> System.out.print("Invalid choice");
        }
            
          System.out.println(result);

    }
}
