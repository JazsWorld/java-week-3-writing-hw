package homework_week3;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
  * HINT: use ternary operator ( ? :)
  * */

public class Programme_1
{
        public static void main(String[] args)
        {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any number: ");
            int num = scanner.nextInt();
            oddevenmethod(num);
            // closing the scanner object
            scanner.close();
        }

        // Checking the number is even or odd
        public static void oddevenmethod(int num)
        {
            //ternary operator is used
            String evenOrOdd = (num % 2 == 0) ? "even number" : "odd number";
            System.out.println(num + " is an " + evenOrOdd);
        }

    }

