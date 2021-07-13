package lv.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int countOdd = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int[] numbers = new int[scan.nextInt()];
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter a number: ");
            numbers[i] = scan.nextInt();

            if (numbers[i] % 2 != 0) {
                countOdd++;

            }

        }

        System.out.println("The amount of odd numbers is: " + countOdd);
    }
}
