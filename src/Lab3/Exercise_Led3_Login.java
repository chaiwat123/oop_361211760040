package Lab3;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Exercise_Led3_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";


        int count = 0;
        do {
            System.out.print("username:");
            String u = sc.nextLine();
            System.out.print("password:");
            String p = sc.nextLine();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welocme to MT System. ");
                break;
            } else {
                System.out.println("username or password is not corrected. ");

                count++;
                if (count == 3) {
                    System.out.println("Your account has been locked." +
                            "Please, contact admin");
                }

                }
            }while (count < 3);





    }
}
