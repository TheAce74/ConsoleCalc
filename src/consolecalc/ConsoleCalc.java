package consolecalc;

import java.util.Scanner;

public class ConsoleCalc {

    public static void main(String[] args) {
        //Welcome the user and find out what operation or operations he/she wants to perform
        System.out.println("Welcome User \nWhat binary operation(s) would you like to perform?");
        System.out.println("Enter 1 for exponentiation only \nEnter 2 for addition only \nEnter 3 for subtraction only \nEnter 4 for multiplication only");
        System.out.println("Enter 5 for exponentiation and addition \nEnter 6 for exponentiation and subtraction \nEnter 7 for exponentiation and multiplication");
        System.out.println("Enter 8 for addition and subtraction \nEnter 9 for addition and multiplication");
        System.out.println("Enter 10 for subtraction and multiplication");
        System.out.println("Enter 11 for exponentiation, addition and subtraction \nEnter 12 for exponentiation, subtraction and multiplication");
        System.out.println("Enter 13 for exponentiation, addition and multiplication \nEnter 14 for addition, subtraction and multiplication");
        System.out.println("Enter 15 for exponentiation, addition, subtraction, and multiplication");
        System.out.println("Note: For the exponentiation operation, the first number you provide is used as the base and the second is used as the exponent");
        System.out.println("As for the subtraction operation, the first number is the minuend and the second is the subtrahend");
        
        //Declare and initialize the scanner variable
        Scanner scanner = new Scanner(System.in);
        
        //Taking the user's input
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double second = scanner.nextDouble();
        
        //handling operations based on user's choice
        switch(choice) {
            case 1: 
                exponentiation(first, second);
                break;
            case 2: 
                addition(first, second);
                break;
            case 3: 
                subtraction(first, second);
                break;
            case 4: 
                multiplication(first, second);
                break;
            case 5: 
                exponentiation(first, second);
                addition(first, second);
                break;
            case 6: 
                exponentiation(first, second);
                subtraction(first, second);
                break;
            case 7: 
                exponentiation(first, second);
                multiplication(first, second);
                break;
            case 8: 
                addition(first, second);
                subtraction(first, second);
                break;
            case 9: 
                addition(first, second);
                multiplication(first, second);
                break;
            case 10: 
                subtraction(first, second);
                multiplication(first, second);
                break;
            case 11: 
                exponentiation(first, second);
                addition(first, second);
                subtraction(first, second);
                break;
            case 12: 
                exponentiation(first, second);
                subtraction(first, second);
                multiplication(first, second);
                break;
            case 13: 
                exponentiation(first, second);
                addition(first, second);
                multiplication(first, second);
                break;
            case 14: 
                addition(first, second);
                subtraction(first, second);
                multiplication(first, second);
                break;
            case 15: 
                exponentiation(first, second);
                addition(first, second);
                subtraction(first, second);
                multiplication(first, second);
                break;
            default:
                System.out.println("You didn't make a valid choice");
        }
    }
    
    //Declaring reusable methods
    public static void exponentiation(double base, double exponent) {
        double answer = Math.pow(base, exponent);
        System.out.println("The result of the exponentiation is " + answer);
    }
    
    public static void addition(double first, double second) {
        double answer = first + second;
        System.out.println("The result of the addition is " + answer);
    }
    
    public static void subtraction(double first, double second) {
        double answer = first - second;
        System.out.println("The result of the subtraction is " + answer);
    }
    
    public static void multiplication(double first, double second) {
        double answer = first * second;
        System.out.println("The result of the multiplication is " + answer);
    }
}
