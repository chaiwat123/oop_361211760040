package Lab3;

import java.util.Scanner;

public class Exercise_Led3_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num=1234;
        do {
            System.out.print("Welcome to MT Website:");
            num = sc.nextInt();
        } while (num!= 456);
        System.out.print("You account has been locked.Please, contect admin.");



    }
}
