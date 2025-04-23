
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean choice2 = true;
        do {
            try {
                System.out.println("enter 2 numbers");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println("here it is your num" + num1 + num2);
                choice2 = false;
            } catch (InputMismatchException i) {
                System.out.println("please enter a number");
                scanner.nextLine();
            }
        }while (choice2);

        boolean choice = true;
        do {
            System.out.println("enter a num");

            try {
                int num3 = Integer.parseInt(scanner.nextLine());
                System.out.println("here is ur number " + num3);
                choice = false;
            } catch (NumberFormatException s) {
                System.out.println("please enter a valid number");
            }
        }while (choice);

//        #4
        boolean guess = true;
        do {
            System.out.println("guess the number between 1-6");
            try {
                int num = scanner.nextInt();
                int random = (int) (Math.random() * 6) + 1;
                if (num == random) {
                    System.out.println("booommm");
                } else {
                    System.out.println("try again");
                }
                guess = false;
            } catch (InputMismatchException l) {
                System.out.println("please enter a number");
                scanner.nextLine();
            }
        } while (guess);
        System.out.println("u successfully did it");
//         #6
        System.out.println("enter a number");

        boolean number = false;
        do {
            try {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("its even");
                } else {
                    System.out.println("its odd");
                }
                number = false;
            } catch (InputMismatchException k) {
                System.out.println("Please enter a number");
                scanner.nextLine();
            }
        }while (!number);

        //#7

        boolean calculator = true;
        do {
            System.out.println("what do u want to do 1:+\n2:-\n3:*\n4:/");

            try {
                int desire = scanner.nextInt();
                System.out.println("enter 2 numbers");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();

                double result = 0;
                if (desire == 1) {
                    result = num1 + num2;
                } else if (desire == 2) {
                    result = num1 - num2;
                } else if (desire == 3) {
                    result = num1 * num2;
                } else if (desire == 4) {
                    result = num1 / num2;
                } else {
                    System.out.println("invalid");
                }
                System.out.println(result);
                calculator = false;
            } catch (InputMismatchException e) {
                System.out.println("please enter a number");
                scanner.nextLine();
            }
        }while (calculator);

        //#8
        int num1=  0;
        try {
            System.out.println("enter 3 numbers");
            System.out.println("enter the first number");
            num1 = scanner.nextInt();
            System.out.println("enter the second number");
            int num2 = scanner.nextInt();
            System.out.println("enter the third number");
            int num3 = scanner.nextInt();
        } catch (InputMismatchException e) {

//            if (num1 == e ){
//            System.out.println("enter the first number again");
//            scanner.nextLine();
//
//        }
        }

    }}
