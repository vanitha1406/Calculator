import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=================================");
        System.out.println("      ADVANCED CALCULATOR");
        System.out.println("=================================");

        do {

            System.out.println("\nChoose an Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Percentage");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            double num1, num2;

            switch (choice) {

                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Result = " + (num1 / num2));
                    }
                    break;

                case 5:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + (num1 % num2));
                    break;

                case 6:
                    System.out.print("Enter Base Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Power: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + Math.pow(num1, num2));
                    break;

                case 7:
                    System.out.print("Enter Number: ");
                    num1 = sc.nextDouble();

                    if (num1 < 0) {
                        System.out.println("Square Root of negative number is not possible.");
                    } else {
                        System.out.println("Result = " + Math.sqrt(num1));
                    }
                    break;

                case 8:
                    System.out.print("Enter Total Value: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Percentage: ");
                    num2 = sc.nextDouble();

                    System.out.println("Result = " + ((num1 * num2) / 100));
                    break;

                case 9:
                    System.out.println("Thank You For Using Advanced Calculator!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 9);

        sc.close();
    }
}