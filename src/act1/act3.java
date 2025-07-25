package act1;

import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("//instance 1");
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        checkSign(num1);
        
        System.out.println("\n//instance 2");
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        checkSign(num2);
        
         System.out.println("\n//instance 1");
        System.out.print("Enter a number: ");
        int num3 = input.nextInt();
        checkSign(num3);

        input.close();
    }

    public static void checkSign(int number) {
        if (number > 0) {
            System.out.println("\n" + number + " is a positive number");
        } else if (number < 0) {
            System.out.println("\n" + number + " is a negative number");
        } else {
            System.out.println("\nInputted number Zero");
        }
    }
        
}
