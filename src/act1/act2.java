
package act1;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        System.out.println("//instance 1");
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        checkNumber(num1);

      
        System.out.println("\n//instance 2");
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        checkNumber(num2);

   
        System.out.println("\n//instance 1");
        System.out.print("Enter a number: ");
        int num3 = input.nextInt();
        checkNumber(num3);

        input.close();
    }

   
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("\nInputted number Zero");
        } else if (number % 2 == 0) {
            System.out.println("\nInputted number is even");
        } else {
            System.out.println("\nInputted number is odd");
        }
    }
}
