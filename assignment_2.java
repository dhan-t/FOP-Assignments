import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int product = multiply();
        System.out.println("The result of multiplication is: " + product);
        int quotient = divide();
        System.out.println("The result of the division: " + quotient);
        String crush = crushReveal();
        System.out.println(crush);
        
        myOrder();

        scan.close();
    }

    static int multiply() {
        System.out.println("Enter first number; ");
        int x = scan.nextInt();
        System.out.print("Enter your second number: ");
        int y = scan.nextInt();
        return x * y;
    }
    static int divide(){
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        return a/b;
    }
    static String crushReveal(){
        System.out.println("This program reveals your crush");
        System.out.println("Enter your name");
        String myName = scan.nextLine();
        System.out.println("Enter your crush's name: ");
        String crushName = scan.nextLine();
        System.out.println("Enter your other crush: ");
        String crushTwo = scan.nextLine();
        return myName + " loves " + crushName + " and " + crushTwo;
    }

    static void myOrder() {

        System.out.println("Welcome to KFC! What would you like to order?");
        System.out.println("Your first order: ");
        String firstOrder = scan.nextLine();
        System.out.println("PRICE: ");
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Your second order: ");
        String secondOrder = scan.nextLine();
        System.out.println("PRICE: ");
        double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Your third order: ");
        String thirdOrder = scan.nextLine();
        System.out.println("PRICE: ");
        double price3 = scan.nextDouble();

        double priceTotal = firstOrder + secondOrder + thirdOrder;

        System.out.println("Your order is: " + firstOrder + secondOrder + thirdOrder + ".");
        System.out.println("TOTAL:" + priceTotal);

    }
}
