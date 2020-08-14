package Lab3;

import java.util.Scanner;

public class Ex_switch_case {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //display menu
        System.out.println("What is your favorite food? ");
        System.out.println("1.KFC");
        System.out.println("2.Shadu");
        System.out.println("3.Pizza");
        System.out.println("Select:");
        int s = scanner.nextInt(); //input integer from user

        switch (s){
            case 1: System.out.println("Wow, I like berger at KFC.");
                break;
            case 2: System.out.println("You have to spend 300 THB per person.");
                break;
            case 3: System.out.println("I do not like pizza.");
                break;
            default:System.out.println("Please, select 1-3. thank.");

        }






    }
}
