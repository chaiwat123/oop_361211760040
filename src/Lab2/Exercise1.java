package Lab2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" number1 :");
        double n1 = scanner.nextDouble();
        System.out.println("number2 ");
        double n2 = scanner.nextDouble();
        System.out.println(" number3 :");
        double n3 = scanner.nextDouble();
        System.out.println(" number4 :");
        double n4 = scanner.nextDouble();
        System.out.println(" number5 :");
        double n5 = scanner.nextDouble();

        double total = n1 + n2 + n3 + n4 + n5;//
        System.out.println("ผลรวมคือ "+total);
        System.out.println("total/5 ");

    }//main
}
