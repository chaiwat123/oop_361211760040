package Lab3;

import java.util.Scanner;

// 1.KFC
// 2.Shadu
// 3.Pizza
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score");
       int s = scanner.nextInt();

        if ( s == 1){ //int or char
            System.out.println("Wow, I like berger at KFC.");
        } else if (s == 2){
            System.out.println("You have to spend 300 THB per person.");
        } else if (s == 3){
            System.out.println("I do not like pizza.");
        } else {
            System.out.println("Please, select 1-3. thank.");
        }




    }
}
