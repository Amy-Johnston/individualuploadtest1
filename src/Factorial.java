/* Factorial.java
 * This program determines the factorial of an inputted number
 * Author: Amy Johnston(218188773)
 * Date created: 16/02/2020
 */

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n;
        int count = 1;
        int ans = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = input.nextInt();

        while (count <= n)
        {
            ans = ans* count;
            count++;
        }
        System.out.println("The factorial of " +n+ " is: " +ans);
    }
}
