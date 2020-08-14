package Lab3;

import java.util.Scanner;

// 0-49.99      F
// 50.00-59.99  D
// 60.00-69.99  C
// 70.00-79.99  B
// 80.00-100.00 A
public class Ex_if_eise_if {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score");
        double score = scanner.nextDouble();

        if (score >= 0 && score <=49.99){
            System.out.println("Your grade is F.");
        } else if (score >=50.00 && score <= 59.99){
            System.out.println("Your grade is D.");
        } else if (score >=60.00 && score <=69.99){
            System.out.println("Your grade is C.");
        } else if (score >=70.00 && score <=79.99){
            System.out.println("Your grade is B.");
        } else if (score >=80.00 && score <=100.00){
            System.out.println("Your grade is A.");
        } else {
            System.out.println("Please, enter score between 0-100.");
        }



    }
}
