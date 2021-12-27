package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 100; // for random generation
        Random rand = new Random();
        int int_random = rand.nextInt(num);
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int i = 0;
        while (i == 0) {
            if (input == int_random) {
                System.out.println("Nice! You won.");
                i = 1;
            }
            else if (input > int_random) {
                System.out.println("Random num is less than your: ");
                input = in.nextInt();
            }
            else if (input < int_random) {
                System.out.println("Random num is greater than your: ");
                input = in.nextInt();
            }
        }
    }
}
