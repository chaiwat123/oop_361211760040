package Lab4;

import java.util.Scanner;

public class Exercise_Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecl find area list below:");
        System.out.println("1.รูปสี่เหลี่ยม");
        System.out.println("2.รูปสามเหลี่ยม");
        System.out.println("3.รูปวงกลม");
        System.out.println("Select:");
        int s = scanner.nextInt(); //input integer from user

        switch (s) { //int or char
            case 1:findAreaCir();
                break;
            case 2:findAreaCir();
                break;
            case 3:findAreaCir();
                break;
            default:
                System.out.println("Please, select 1-3. thank.");

        }


    }//main

    private static void findAreaCir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width:");
        double x = sc.nextDouble();
        System.out.print("Enter length:");
        double y = sc.nextDouble();

        System.out.println("The area of rectangle is:"+(x*y));
    }
    //รูปสามเหลี่ยม
    public static void () {
        //statement
        Scanner scanner = new Scanner(System.in);
        System.out.print("ฐาน");
        double a = scanner.nextDouble();
        System.out.print("ความสูง");
        double b = scanner.nextDouble();

        double area = 0.5 * a * b;
        //display
        System.out.println("พื้นที่สามเหลี่ยม :" + area);
    }

}//class
